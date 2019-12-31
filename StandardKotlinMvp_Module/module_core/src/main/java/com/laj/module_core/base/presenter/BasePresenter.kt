package com.laj.module_core.base.presenter

import com.laj.module_core.base.IBaseView
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Desc:
 * Author: hy
 * Date: 2019/7/15 8:39
 **/
open class BasePresenter<V : IBaseView> {

    protected var mRealView: V? = null
    private var mCompositeDisposable: CompositeDisposable? = null

    fun attachView(view: V) {
        mRealView = view
    }

    fun detachView() {
        mRealView = null
        unSubscribe()
    }

    fun addSubscribe(disposable: Disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = CompositeDisposable()
        }
        mCompositeDisposable?.add(disposable)
    }

    private fun unSubscribe() {
        mCompositeDisposable?.dispose()
    }
}