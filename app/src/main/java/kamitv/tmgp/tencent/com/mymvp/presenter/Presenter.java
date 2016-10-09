package kamitv.tmgp.tencent.com.mymvp.presenter;

/**
 * Created by Administrator on 2016/10/8.
 */
public interface Presenter<V> {
    void attachView(V view);

    void detachView();
}
