package com.linqinen708.mydatabinding.recyclerview.bean.viewmodel;

import android.util.Log;
import android.view.View;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.linqinen708.mydatabinding.recyclerview.adapter.BaseBindingAdapter;
import com.linqinen708.mydatabinding.recyclerview.bean.MyBean;

/**
 * Created by Ian on 2019/12/25.
 */
public class MyViewModel extends ViewModel {

    private final MyBean mBean;
    private BaseBindingAdapter<?, ? extends ViewDataBinding> adapter = null;

    public MyViewModel(MyBean bean, BaseBindingAdapter<?, ? extends ViewDataBinding> adapter) {
        mBean = bean;
        this.adapter = adapter;

    }

    public MyViewModel(MyBean bean) {
        mBean = bean;
    }

    public int isVisible() {
        return mBean.isChecked() ? View.VISIBLE : View.GONE;
    }

    public void onClickBtn() {
        mBean.setName("abcd11111");
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }


    public void setAdapter(BaseBindingAdapter<?, ? extends ViewDataBinding> adapter) {
        this.adapter = adapter;
    }
}
