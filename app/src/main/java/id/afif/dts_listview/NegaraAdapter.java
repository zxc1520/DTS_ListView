package id.afif.dts_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NegaraAdapter extends ArrayAdapter<Negara> {

    private ArrayList<Negara> dataNegara;
    private Context mContext;

    public NegaraAdapter(ArrayList<Negara> negaras, Context context) {
        super(context, R.layout.item_negara, negaras);
        this.dataNegara = negaras;
        this.mContext = context;
    }

    private static class ViewHolder {
        TextView txtName;
        TextView txtDetail;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Negara negara = getItem(position);

        ViewHolder viewHolder;
        View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.item_negara, parent, false);
            viewHolder.txtName = convertView.findViewById(R.id.tvNama);
            viewHolder.txtDetail = convertView.findViewById(R.id.tvDetail);

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)convertView.getTag();
            result = convertView;
        }

        viewHolder.txtName.setText(negara.getNama());
        viewHolder.txtDetail.setText(negara.getDetail());

        return convertView;
    }
}
