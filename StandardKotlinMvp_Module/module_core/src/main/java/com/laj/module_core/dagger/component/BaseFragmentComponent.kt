package com.laj.module_core.dagger.component

import com.laj.module_core.base.fragment.BaseFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Create by aragon
 * Date: 2018/11/27 18:55
 * description:
 */
@Subcomponent(modules = [AndroidSupportInjectionModule::class])
interface BaseFragmentComponent : AndroidInjector<BaseFragment<*, *>> {

    /**
     * 每一个继承BaseFragment的Fragment，都共享同一个SubComponent
     */
    @Subcomponent.Builder
    abstract class BaseBuilder : AndroidInjector.Builder<BaseFragment<*, *>>()
}
