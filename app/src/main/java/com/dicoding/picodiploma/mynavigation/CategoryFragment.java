package com.dicoding.picodiploma.mynavigation;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnDetailCategory = view.findViewById(R.id.btn_detail_category);
//        btnDetailCategory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Bundle mBundle = new Bundle();
//                mBundle.putString(DetailCategoryFragment.EXTRA_NAME, "Lifestyle");
//                mBundle.putString(DetailCategoryFragment.EXTRA_DESCRIPTION, "Kategori ini akan berisi produk-produk lifestyle");
//                Navigation.findNavController(view).navigate(R.id.action_categoryFragment_to_detailCategoryFragment, mBundle);
//            }
//        });

        btnDetailCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CategoryFragmentDirections.ActionCategoryFragmentToDetailCategoryFragment toDetailCategoryFragment = CategoryFragmentDirections.actionCategoryFragmentToDetailCategoryFragment();
                toDetailCategoryFragment.setName("Lifestyle");
                toDetailCategoryFragment.setDescription("Kategori ini akan berisi produk-produk lifestyle");
                Navigation.findNavController(view).navigate(toDetailCategoryFragment);
            }
        });
    }
}
