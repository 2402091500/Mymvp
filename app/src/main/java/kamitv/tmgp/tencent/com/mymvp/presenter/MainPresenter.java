package kamitv.tmgp.tencent.com.mymvp.presenter;

import kamitv.tmgp.tencent.com.mymvp.model.MainModel;
import kamitv.tmgp.tencent.com.mymvp.model.MainModelBean;
import kamitv.tmgp.tencent.com.mymvp.view.MainView;

/**
 * Created by Administrator on 2016/10/8.
 */
public class MainPresenter implements Presenter<MainView>, IMainPresenter {
    private MainView mMainView;
    private MainModel mMainModel;

    public MainPresenter(MainView view) {
        attachView(view);
        mMainModel = new MainModel(this);
    }
    public void loadData() {
        mMainView.showProgress();
        mMainModel.loadData();
    }
    @Override
    public void loadDataSuccess(MainModelBean mainModelBean) {
        mMainView.showData(mainModelBean);
        mMainView.hideProgress();
    }

    @Override
    public void loadDataFailure() {
        mMainView.hideProgress();
    }

    @Override
    public void attachView(MainView view) {
        this.mMainView = view;
    }

    @Override
    public void detachView() {
        this.mMainView = null;
    }
}
