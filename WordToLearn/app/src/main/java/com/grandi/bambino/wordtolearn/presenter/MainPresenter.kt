package com.grandi.bambino.wordtolearn.presenter

import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.model.source.DataSource
import com.grandi.bambino.wordtolearn.repository.Repository
import com.grandi.bambino.wordtolearn.view.View
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainPresenter<T : AppState, V : View>(
    private val interactor : MainInteractor = MainInteractor(
        Repository(DataSource())
    )
) : IPresenter<T, V> {

    private var currentView: V? = null
    private val compositeDisposable = CompositeDisposable()

    override fun attachView(view: V) {
        if (view != currentView) currentView = view
    }

    override fun detachView(view: V) {
        compositeDisposable.clear()
        if (view == currentView)
            currentView = null
    }

    override fun getData(word: String, isOnline: Boolean) {
        compositeDisposable.add(
            interactor.getData(word, isOnline)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    currentView?.renderData(it)
                },{
                    currentView?.renderData(AppState.Error(it))
                })
        )
    }
}