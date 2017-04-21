package com.vishaldwivedi.intelliJournal.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vishaldwivedi.intelliJournal.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class AddAccountsFragment extends Fragment {

    public AddAccountsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_accounts, container, false);
    }
}
