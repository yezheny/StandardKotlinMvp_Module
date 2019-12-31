package com.laj.module_router.ui.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.laj.module_core.common.extensions.find
import com.laj.module_router.R

/**
 * created by yezhengyu on 2019/12/23 15:42
 */
class ARouterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arouter)
        find<TextView>(R.id.arouter_tv_main).setOnClickListener {
            ARouter.getInstance().build("/com/MainActivity").navigation()
        }
        find<TextView>(R.id.arouter_tv_more).setOnClickListener {
            ARouter.getInstance().build("/com/MoreNutritionsActivity").withLong("kid", 469484041527583).navigation()
        }
    }
}