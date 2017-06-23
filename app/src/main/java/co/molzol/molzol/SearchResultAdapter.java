package co.molzol.molzol;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import co.molzol.model.flipkart.Deal;
import co.molzol.model.flipkart.DealsOfTheDay;
import co.molzol.model.flipkart.ProductInfoList;
import co.molzol.model.flipkart.Products;

/**
 * Created by hp on 13-02-2016.
 */
public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.SearchViewHolder> {

    private LayoutInflater inflater;
    private Products products = new Products();
    private OnItemClickListener onItemClickListener;

    public SearchResultAdapter(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }
    public void setProducts(Products products) {
        this.products = products;
        notifyDataSetChanged();
    }

    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.search_item, parent, false);
        SearchViewHolder searchViewHolder = new SearchViewHolder(view, onItemClickListener);
        return searchViewHolder;
    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {

        try{
            ProductInfoList productInfo = products.getProductInfoList().get(position);

            holder.prodTitle.setText(productInfo.getProductBaseInfo().getProductAttributes().getTitle());
            holder.prodMRP.setText(productInfo.getProductBaseInfo().getProductAttributes().getMaximumRetailPrice().getAmount().toString());
            holder.prodCurrPrice.setText(productInfo.getProductBaseInfo().getProductAttributes().getSellingPrice().getAmount().toString());
            holder.prodUrl = productInfo.getProductBaseInfo().getProductAttributes().getProductUrl();
            holder.prodStore.setImageResource(R.drawable.flipkart);
            String prodImage = productInfo.getProductBaseInfo().getProductAttributes().getImageUrls().get("400x400");
            Uri prodImageUri = Uri.parse(prodImage);
            Context context = holder.prodImage.getContext();
            Picasso.with(context).load(prodImageUri).fit().centerInside().into(holder.prodImage);
        }catch(Exception e){

        }

    }

    @Override
    public int getItemCount() {
        try {
            return products.getProductInfoList().size();
        } catch(Exception e) {
            return 0;
        }
    }

    public static class SearchViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView prodImage;
        public ImageView prodStore;
        public TextView prodTitle;
        public TextView prodMRP;
        public TextView prodCurrPrice;
        public String prodUrl;
        private OnItemClickListener onItemClickListener;

        public SearchViewHolder(View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);
            prodImage = (ImageView) itemView.findViewById(R.id.prodImage);
            prodStore = (ImageView) itemView.findViewById(R.id.prodStore);
            prodTitle = (TextView) itemView.findViewById(R.id.prodTitle);
            prodMRP = (TextView) itemView.findViewById(R.id.prodMRP);
            prodMRP.setPaintFlags(prodMRP.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            prodCurrPrice = (TextView) itemView.findViewById(R.id.prodCurrPrice);
            this.onItemClickListener = onItemClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            this.onItemClickListener.onItemClick(prodUrl);

        }
    }

    public interface OnItemClickListener
    {
        void onItemClick(String s);
    }

}
