package kamitv.tmgp.tencent.com.mymvp.view;

import kamitv.tmgp.tencent.com.mymvp.model.MainModelBean;

/**
 * Created by Administrator on 2016/10/8.
 */
public interface MainView {

    void showData(MainModelBean mainModelBean);

    void showProgress();

    void hideProgress();
}
