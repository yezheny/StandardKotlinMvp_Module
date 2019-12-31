package com.laj.standardkotlinmvp.presenter

import com.laj.module_core.base.presenter.BasePresenter
import com.laj.module_core.common.extensions.rxProgressSubscribe
import com.laj.module_core.common.extensions.transformData
import com.laj.standardkotlinmvp.net.ApiService
import com.laj.standardkotlinmvp.presenter.views.IIngredientsView
import javax.inject.Inject

/**
 * Desc:食材presenter
 * Author: hy
 * Date: 2019/4/3 15:05
 **/
class IngredientsPresenter @Inject constructor(var apiService: ApiService)
    : BasePresenter<IIngredientsView>() {

    fun getMoreNutritions(params: HashMap<String, Any>, loadType: Int = -1) {
        apiService.getMoreNutritions(params)
                .compose(mRealView?.transformData())
                .rxProgressSubscribe(mRealView, loadType) {
                    mRealView?.showResponse(it.get(), loadType)
                }
    }
}
