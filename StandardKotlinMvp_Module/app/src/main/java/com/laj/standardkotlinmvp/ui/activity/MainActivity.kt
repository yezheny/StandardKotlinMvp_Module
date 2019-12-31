package com.laj.standardkotlinmvp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.fresco.helper.ImageLoader
import com.laj.standardkotlinmvp.R
import com.laj.module_core.common.extensions.find
import com.laj.module_core.common.extensions.startActivity
import com.laj.module_router.ui.activity.ARouterActivity

@Route(path = "/com/MainActivity")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sdv = find<SimpleDraweeView>(R.id.sdv_helloworld)
        ImageLoader.loadImage(
            sdv,
            "https://cdn.lajsf.com/nutrition-plan/image/default/common/488986194345989.jpg?w=750&h=722"
        )
        sdv.setOnClickListener {
            ARouter.getInstance().build("/com/MoreNutritionsActivity").withLong("kid", 469484041527583).navigation()
        }

        find<TextView>(R.id.tv_helloworld).setOnClickListener {
            startActivity<ARouterActivity>()
        }
    }
}
