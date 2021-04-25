package id.co.npad93.pm.t4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ElementDataAdapter extends RecyclerView.Adapter<ElementDataAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ElementData elem = ElementData.get(position);
        holder.name.setText(elem.getName());
        holder.nation.setText(elem.getNation());
    }

    @Override
    public int getItemCount() {
        return ElementData.count();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, nation;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView4);
            nation = itemView.findViewById(R.id.textView5);
        }
    }
}
