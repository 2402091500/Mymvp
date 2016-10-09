package kamitv.tmgp.tencent.com.mymvp.presenter;

import kamitv.tmgp.tencent.com.mymvp.model.MainModelBean;

/**
 * Created by Administrator on 2016/10/8.
 */
public interface  IMainPresenter {
    void loadDataSuccess(MainModelBean mainModelBean);

    void loadDataFailure();
}
