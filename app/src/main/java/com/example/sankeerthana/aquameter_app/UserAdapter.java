package com.example.sankeerthana.aquameter_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends ArrayAdapter {
    List list = new ArrayList();
    public UserAdapter(Context context, int resource) {
        super(context, resource);
    }


    public void add(User object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View row;
        row = convertView;
        UserHolder userHolder;
        if(row == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.row_layout,parent,false);
            userHolder = new UserHolder();
            userHolder.textViewYear = (AppCompatTextView) row.findViewById(R.id.textViewYear);
            userHolder.textViewMonth = (AppCompatTextView) row.findViewById(R.id.textViewMonth);
            userHolder.textViewName = (AppCompatTextView) row.findViewById(R.id.textViewName);
            userHolder.textViewMailId = (AppCompatTextView) row.findViewById(R.id.textViewMailId);
            userHolder.textViewBillEP1 = (AppCompatTextView) row.findViewById(R.id.textViewBillEP1);
            userHolder.textViewBillEP2 = (AppCompatTextView) row.findViewById(R.id.textViewBillEP2);
            userHolder.textViewBillEP3 = (AppCompatTextView) row.findViewById(R.id.textViewBillEP3);
            userHolder.textViewBillFlat = (AppCompatTextView) row.findViewById(R.id.textViewBillFlat);
            userHolder.textViewUsageEP1 = (AppCompatTextView) row.findViewById(R.id.textViewUsageEP1);
            userHolder.textViewUsageEP2 = (AppCompatTextView) row.findViewById(R.id.textViewUsageEP2);
            userHolder.textViewUsageEP3 = (AppCompatTextView) row.findViewById(R.id.textViewUsageEP3);
            userHolder.textViewUsageFlat = (AppCompatTextView) row.findViewById(R.id.textViewUsageFlat);
            row.setTag(userHolder);

        }
        else
        {
            userHolder = (UserHolder)row.getTag();
        }

        User user = (User) this.getItem(position);
        userHolder.textViewYear.setText(user.getYear());
        userHolder.textViewMonth.setText(user.getMonth());
        userHolder.textViewName.setText(user.getName());
        userHolder.textViewMailId.setText(user.getMailId());
        userHolder.textViewBillEP1.setText(user.getBill_ep1());
        userHolder.textViewBillEP2.setText(user.getBill_ep2());
        userHolder.textViewBillEP3.setText(user.getBill_ep3());
        userHolder.textViewBillFlat.setText(user.getBill_flat());
        userHolder.textViewUsageEP1.setText(user.getUsage_ep1());
        userHolder.textViewUsageEP2.setText(user.getUsage_ep2());
        userHolder.textViewUsageEP3.setText(user.getUsage_ep3());
        userHolder.textViewUsageFlat.setText(user.getUsage_flat());

        return row;
    }

    static class UserHolder{
        AppCompatTextView textViewYear,textViewMonth,textViewName,textViewMailId,textViewBillEP1,textViewBillEP2,textViewBillEP3,
                textViewBillFlat,textViewUsageEP1,textViewUsageEP2,textViewUsageEP3,textViewUsageFlat;

    }

}

