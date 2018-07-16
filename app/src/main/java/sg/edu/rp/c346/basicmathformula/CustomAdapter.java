package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16019865 on 16/7/2018.
 */




    public class CustomAdapter extends ArrayAdapter {

        Context parent_context;
        int layout_id;
        ArrayList<Mathformula> employee;


        public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Mathformula> objects) {
            super(context, resource, objects);
            parent_context = context;
            layout_id = resource;
            employee = objects;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            View rowview;

            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                rowview = inflater.inflate(layout_id, parent, false);
            }
            else {
                rowview = convertView;
            }




            TextView tvName = rowview.findViewById(R.id.textViewName);
            TextView tvFormula = rowview.findViewById(R.id.textViewFormula);
            TextView tvType = rowview.findViewById(R.id.textViewType);
            Mathformula currentItem = employee.get(position);
            String name = currentItem.getName();
            String title = currentItem.getFormula();
            String types = currentItem.getType();

            tvName.setText(name);
            tvFormula.setText(title);
            tvType.setText("Formula Types is "+types);

            return rowview;
        }

}
