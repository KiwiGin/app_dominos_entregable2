package com.example.app_figma1.ui.food.pizzas;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_figma1.R;
import com.example.app_figma1.databinding.FragmentPizzaBinding;
import com.example.app_figma1.databinding.FragmentSlideshowBinding;

public class PizzaFragment extends Fragment {

    private PizzaViewModel mViewModel;
    private FragmentPizzaBinding binding;

    public static PizzaFragment newInstance() {
        return new PizzaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentPizzaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView regresar = root.findViewById(R.id.regresar_button2);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Regresando 1", Toast.LENGTH_SHORT).show();
                NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_main);
                navController.navigateUp();
            }
        });


        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PizzaViewModel.class);
        // TODO: Use the ViewModel
    }

}