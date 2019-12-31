package com.laj.module_core.dagger.component

import com.laj.module_core.base.activity.BaseInjectActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Create by aragon
 * Date: 2018/11/27 18:55
 * description:
 */
@Subcomponent(modules = [AndroidSupportInjectionModule::class])
interface BaseActivityComponent : AndroidInjector<BaseInjectActivity> {

    /**
     * 每一个继承BaseActivity的Activity，都共享同一个SubComponent
     */
    @Subcomponent.Builder
    abstract class BaseBuilder : AndroidInjector.Builder<BaseInjectActivity>()

}
