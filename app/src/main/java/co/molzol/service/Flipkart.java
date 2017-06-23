package co.molzol.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import co.molzol.model.flipkart.Deal;
import co.molzol.model.flipkart.DealsOfTheDay;
import co.molzol.model.flipkart.ImageUrl;
import co.molzol.model.flipkart.ImageUrls;
import co.molzol.model.flipkart.MaximumRetailPrice;
import co.molzol.model.flipkart.ProductAttributes;
import co.molzol.model.flipkart.ProductBaseInfo;
import co.molzol.model.flipkart.ProductIdentifier;
import co.molzol.model.flipkart.ProductInfoList;
import co.molzol.model.flipkart.Products;
import co.molzol.model.flipkart.SellingPrice;

/**
 * Created by hp on 14-02-2016.
 */
public class Flipkart {

    private static String SEARCH_PRODUCT = "https://affiliate-api.flipkart.net/affiliate/search/json";
    private static String FETCH_DEALS = "https://affiliate-api.flipkart.net/affiliate/offers/v1/dotd/json";

    private static RestTemplate restTemplate;
    private static HttpHeaders requestHeaders;
    private static HttpEntity requestEntity;

    static{
        restTemplate = new RestTemplate();
        requestHeaders = new HttpHeaders();
        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
        requestHeaders.set("Fk-Affiliate-Id", "careeramr");
        requestHeaders.set("Fk-Affiliate-Token","9fb75352eb43425597731e5fa3064462");
        requestEntity = new HttpEntity(requestHeaders);
    }

    public static DealsOfTheDay fetchDeals(){
        try {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(FETCH_DEALS);

        ResponseEntity<DealsOfTheDay> response = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, requestEntity, DealsOfTheDay.class);

        return response.getBody();
        } catch (Exception e) {
            DealsOfTheDay dod = new DealsOfTheDay();
            List<Deal> dealList = new ArrayList<Deal>();
            Deal d = new Deal();
            ImageUrl iu = new ImageUrl();
            List<ImageUrl> iuList = new ArrayList<ImageUrl>();
            iuList.add(iu);
            iuList.add(iu);
            iuList.add(iu);
            iuList.add(iu);
            d.setImageUrls(iuList);
            dealList.add(d);
            dod.setDotdList(dealList);

            return dod;
        }
    }

    public static Products searchProducts(String query, int count){

        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(SEARCH_PRODUCT)
                    .queryParam("query", query)
                    .queryParam("resultCount", count);

            ResponseEntity<Products> response = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, requestEntity, Products.class);
            return response.getBody();
        } catch (Exception e) {
            /*Products products = new Products();
            ProductInfoList pil = new ProductInfoList();
            ProductBaseInfo pbi = new ProductBaseInfo();
            ProductAttributes pa = new ProductAttributes();
            ProductIdentifier pi = new ProductIdentifier();
            //ImageUrls iu = new ImageUrls();
            pa.setImageUrls(new HashMap());
            MaximumRetailPrice mrp = new MaximumRetailPrice();
            mrp.setAmount(0.00);
            SellingPrice sp = new SellingPrice();
            sp.setAmount(0.00);
            pa.setSellingPrice(sp);
            pa.setMaximumRetailPrice(mrp);
            pbi.setProductIdentifier(pi);
            pbi.setProductAttributes(pa);
            pil.setProductBaseInfo(pbi);
            List<ProductInfoList> pilList = new ArrayList<ProductInfoList>();
            pilList.add(pil);
            products.setProductInfoList(pilList);
            return products;*/
            return null;
        }


    }

}
