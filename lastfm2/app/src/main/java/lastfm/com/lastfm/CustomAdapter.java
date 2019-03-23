package lastfm.com.lastfm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<Album> dataList;
    private Context context;

    public CustomAdapter(Context context,List<Album> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView txtTitle, txtArtist;
        ImageView imageView;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            imageView = mView.findViewById(R.id.image);
            txtTitle = mView.findViewById(R.id.title);
            txtArtist = mView.findViewById(R.id.artist);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.txtTitle.setText(dataList.get(position).getName());
        holder.txtArtist.setText(dataList.get(position).getUrl());

        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(dataList.get(position).getUrl())
                .placeholder((R.color.cardview_dark_background))
                .error(R.color.cardview_dark_background)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}