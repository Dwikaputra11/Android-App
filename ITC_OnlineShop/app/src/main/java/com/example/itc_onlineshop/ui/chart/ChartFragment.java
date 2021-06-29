package com.example.itc_onlineshop.ui.chart;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.itc_onlineshop.R;

public class ChartFragment extends Fragment {

    public static ChartFragment newInstance() {
        return new ChartFragment();
    }

    private ChartViewModel chartViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.chart_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        chartViewModel = new ViewModelProvider(this).get(ChartViewModel.class);
        // TODO: Use the ViewModel
    }

}