package com.example.pineone_report;

import android.os.Parcel;
import android.os.Parcelable;

public class GetI30List implements Parcelable {
    @Override
    public String toString() {
        return "GetI30List{" +
                "result_type='" + result_type + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", img_url='" + img_url + '\'' +
                ", img_file_name='" + img_file_name + '\'' +
                ", parent_cat_id='" + parent_cat_id + '\'' +
                ", auth_yn='" + auth_yn + '\'' +
                ", cha_num='" + cha_num + '\'' +
                ", cat_level='" + cat_level + '\'' +
                ", price='" + price + '\'' +
                ", exist_sub_cat='" + exist_sub_cat + '\'' +
                ", pr_info='" + pr_info + '\'' +
                ", runtime='" + runtime + '\'' +
                ", is_51_ch='" + is_51_ch + '\'' +
                ", is_new='" + is_new + '\'' +
                ", is_update='" + is_update + '\'' +
                ", is_hot='" + is_hot + '\'' +
                ", is_caption='" + is_caption + '\'' +
                ", is_hd='" + is_hd + '\'' +
                ", is_continous_play='" + is_continous_play + '\'' +
                ", point='" + point + '\'' +
                ", sub_cnt='" + sub_cnt + '\'' +
                ", close_yn='" + close_yn + '\'' +
                ", svod_yn='" + svod_yn + '\'' +
                ", _3D_yn='" + _3D_yn + '\'' +
                ", service_gb='" + service_gb + '\'' +
                ", filter_gb='" + filter_gb + '\'' +
                ", pps_yn='" + pps_yn + '\'' +
                ", cat_desc='" + cat_desc + '\'' +
                ", is_order='" + is_order + '\'' +
                ", no_cache='" + no_cache + '\'' +
                ", animation_img_file='" + animation_img_file + '\'' +
                ", ppm_yn='" + ppm_yn + '\'' +
                ", ppm_prod_id='" + ppm_prod_id + '\'' +
                ", test_sbc='" + test_sbc + '\'' +
                ", point_count='" + point_count + '\'' +
                ", cat_img_type='" + cat_img_type + '\'' +
                ", img_Url='" + img_Url + '\'' +
                ", img_file_name_h='" + img_file_name_h + '\'' +
                ", img_file_name_v='" + img_file_name_v + '\'' +
                ", i30_point='" + i30_point + '\'' +
                ", suggested_price='" + suggested_price + '\'' +
                ", is_fh='" + is_fh + '\'' +
                ", is_cat_fh='" + is_cat_fh + '\'' +
                ", is_uhd='" + is_uhd + '\'' +
                ", is_cat_uhd='" + is_cat_uhd + '\'' +
                ", nsc_gb='" + nsc_gb + '\'' +
                ", point_watcha='" + point_watcha + '\'' +
                ", point_cine21='" + point_cine21 + '\'' +
                ", channel_num='" + channel_num + '\'' +
                ", category_type='" + category_type + '\'' +
                ", kids_grade='" + kids_grade + '\'' +
                ", category_sub_name='" + category_sub_name + '\'' +
                ", order_yn='" + order_yn + '\'' +
                ", ser_album_id='" + ser_album_id + '\'' +
                ", still_url='" + still_url + '\'' +
                ", main_img_file='" + main_img_file + '\'' +
                ", logo_image_file='" + logo_image_file + '\'' +
                '}';
    }

    private String result_type;
    private String id;
    private String name;
    private String type;
    private String img_url;
    private String img_file_name;
    private String parent_cat_id;
    private String auth_yn;
    private String cha_num;
    private String cat_level;
    private String price;
    private String exist_sub_cat;
    private String pr_info;
    private String runtime;
    private String is_51_ch;
    private String is_new;
    private String is_update;
    private String is_hot;
    private String is_caption;
    private String is_hd;
    private String is_continous_play;
    private String point;
    private String sub_cnt;
    private String close_yn;
    private String svod_yn;
    private String _3D_yn;
    private String service_gb;
    private String filter_gb;
    private String pps_yn;
    private String cat_desc;
    private String is_order;
    private String no_cache;
    private String animation_img_file;
    private String ppm_yn;
    private String ppm_prod_id;
    private String test_sbc;
    private String point_count;
    private String cat_img_type;
    private String img_Url;
    private String img_file_name_h;
    private String img_file_name_v;
    private String i30_point;
    private String suggested_price;
    private String is_fh;
    private String is_cat_fh;
    private String is_uhd;
    private String is_cat_uhd;
    private String nsc_gb;
    private String point_watcha;
    private String point_cine21;
    private String channel_num;
    private String category_type;
    private String kids_grade;
    private String category_sub_name;
    private String order_yn;

    private String ser_album_id;
    private String still_url;
    private String main_img_file;
    private String logo_image_file;

    public GetI30List() {

    }

    protected GetI30List(Parcel in) {
        result_type = in.readString();
        id = in.readString();
        name = in.readString();
        type = in.readString();
        img_url = in.readString();
        img_file_name = in.readString();
        parent_cat_id = in.readString();
        auth_yn = in.readString();
        cha_num = in.readString();
        cat_level = in.readString();
        price = in.readString();
        exist_sub_cat = in.readString();
        pr_info = in.readString();
        runtime = in.readString();
        is_51_ch = in.readString();
        is_new = in.readString();
        is_update = in.readString();
        is_hot = in.readString();
        is_caption = in.readString();
        is_hd = in.readString();
        is_continous_play = in.readString();
        point = in.readString();
        sub_cnt = in.readString();
        close_yn = in.readString();
        svod_yn = in.readString();
        _3D_yn = in.readString();
        service_gb = in.readString();
        filter_gb = in.readString();
        pps_yn = in.readString();
        cat_desc = in.readString();
        is_order = in.readString();
        no_cache = in.readString();
        animation_img_file = in.readString();
        ppm_yn = in.readString();
        ppm_prod_id = in.readString();
        test_sbc = in.readString();
        point_count = in.readString();
        cat_img_type = in.readString();
        img_Url = in.readString();
        img_file_name_h = in.readString();
        img_file_name_v = in.readString();
        i30_point = in.readString();
        suggested_price = in.readString();
        is_fh = in.readString();
        is_cat_fh = in.readString();
        is_uhd = in.readString();
        is_cat_uhd = in.readString();
        nsc_gb = in.readString();
        point_watcha = in.readString();
        point_cine21 = in.readString();
        channel_num = in.readString();
        category_type = in.readString();
        kids_grade = in.readString();
        category_sub_name = in.readString();
        order_yn = in.readString();
        ser_album_id = in.readString();
        still_url = in.readString();
        main_img_file = in.readString();
        logo_image_file = in.readString();
    }

    public static final Creator<GetI30List> CREATOR = new Creator<GetI30List>() {
        @Override
        public GetI30List createFromParcel(Parcel in) {
            return new GetI30List(in);
        }

        @Override
        public GetI30List[] newArray(int size) {
            return new GetI30List[size];
        }
    };

    public String getResult_type() {
        return result_type;
    }

    public void setResult_type(String result_type) {
        this.result_type = result_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getImg_file_name() {
        return img_file_name;
    }

    public void setImg_file_name(String img_file_name) {
        this.img_file_name = img_file_name;
    }

    public String getParent_cat_id() {
        return parent_cat_id;
    }

    public void setParent_cat_id(String parent_cat_id) {
        this.parent_cat_id = parent_cat_id;
    }

    public String getAuth_yn() {
        return auth_yn;
    }

    public void setAuth_yn(String auth_yn) {
        this.auth_yn = auth_yn;
    }

    public String getCha_num() {
        return cha_num;
    }

    public void setCha_num(String cha_num) {
        this.cha_num = cha_num;
    }

    public String getCat_level() {
        return cat_level;
    }

    public void setCat_level(String cat_level) {
        this.cat_level = cat_level;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExist_sub_cat() {
        return exist_sub_cat;
    }

    public void setExist_sub_cat(String exist_sub_cat) {
        this.exist_sub_cat = exist_sub_cat;
    }

    public String getPr_info() {
        return pr_info;
    }

    public void setPr_info(String pr_info) {
        this.pr_info = pr_info;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getIs_51_ch() {
        return is_51_ch;
    }

    public void setIs_51_ch(String is_51_ch) {
        this.is_51_ch = is_51_ch;
    }

    public String getIs_new() {
        return is_new;
    }

    public void setIs_new(String is_new) {
        this.is_new = is_new;
    }

    public String getIs_update() {
        return is_update;
    }

    public void setIs_update(String is_update) {
        this.is_update = is_update;
    }

    public String getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(String is_hot) {
        this.is_hot = is_hot;
    }

    public String getIs_caption() {
        return is_caption;
    }

    public void setIs_caption(String is_caption) {
        this.is_caption = is_caption;
    }

    public String getIs_hd() {
        return is_hd;
    }

    public void setIs_hd(String is_hd) {
        this.is_hd = is_hd;
    }

    public String getIs_continous_play() {
        return is_continous_play;
    }

    public void setIs_continous_play(String is_continous_play) {
        this.is_continous_play = is_continous_play;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getSub_cnt() {
        return sub_cnt;
    }

    public void setSub_cnt(String sub_cnt) {
        this.sub_cnt = sub_cnt;
    }

    public String getClose_yn() {
        return close_yn;
    }

    public void setClose_yn(String close_yn) {
        this.close_yn = close_yn;
    }

    public String getSvod_yn() {
        return svod_yn;
    }

    public void setSvod_yn(String svod_yn) {
        this.svod_yn = svod_yn;
    }

    public String get_3D_yn() {
        return _3D_yn;
    }

    public void set_3D_yn(String _3D_yn) {
        this._3D_yn = _3D_yn;
    }

    public String getService_gb() {
        return service_gb;
    }

    public void setService_gb(String service_gb) {
        this.service_gb = service_gb;
    }

    public String getFilter_gb() {
        return filter_gb;
    }

    public void setFilter_gb(String filter_gb) {
        this.filter_gb = filter_gb;
    }

    public String getPps_yn() {
        return pps_yn;
    }

    public void setPps_yn(String pps_yn) {
        this.pps_yn = pps_yn;
    }

    public String getCat_desc() {
        return cat_desc;
    }

    public void setCat_desc(String cat_desc) {
        this.cat_desc = cat_desc;
    }

    public String getIs_order() {
        return is_order;
    }

    public void setIs_order(String is_order) {
        this.is_order = is_order;
    }

    public String getNo_cache() {
        return no_cache;
    }

    public void setNo_cache(String no_cache) {
        this.no_cache = no_cache;
    }

    public String getAnimation_img_file() {
        return animation_img_file;
    }

    public void setAnimation_img_file(String animation_img_file) {
        this.animation_img_file = animation_img_file;
    }

    public String getPpm_yn() {
        return ppm_yn;
    }

    public void setPpm_yn(String ppm_yn) {
        this.ppm_yn = ppm_yn;
    }

    public String getPpm_prod_id() {
        return ppm_prod_id;
    }

    public void setPpm_prod_id(String ppm_prod_id) {
        this.ppm_prod_id = ppm_prod_id;
    }

    public String getTest_sbc() {
        return test_sbc;
    }

    public void setTest_sbc(String test_sbc) {
        this.test_sbc = test_sbc;
    }

    public String getPoint_count() {
        return point_count;
    }

    public void setPoint_count(String point_count) {
        this.point_count = point_count;
    }

    public String getCat_img_type() {
        return cat_img_type;
    }

    public void setCat_img_type(String cat_img_type) {
        this.cat_img_type = cat_img_type;
    }

    public String getImg_Url() {
        return img_Url;
    }

    public void setImg_Url(String img_Url) {
        this.img_Url = img_Url;
    }

    public String getImg_file_name_h() {
        return img_file_name_h;
    }

    public void setImg_file_name_h(String img_file_name_h) {
        this.img_file_name_h = img_file_name_h;
    }

    public String getImg_file_name_v() {
        return img_file_name_v;
    }

    public void setImg_file_name_v(String img_file_name_v) {
        this.img_file_name_v = img_file_name_v;
    }

    public String getI30_point() {
        return i30_point;
    }

    public void setI30_point(String i30_point) {
        this.i30_point = i30_point;
    }

    public String getSuggested_price() {
        return suggested_price;
    }

    public void setSuggested_price(String suggested_price) {
        this.suggested_price = suggested_price;
    }

    public String getIs_fh() {
        return is_fh;
    }

    public void setIs_fh(String is_fh) {
        this.is_fh = is_fh;
    }

    public String getIs_cat_fh() {
        return is_cat_fh;
    }

    public void setIs_cat_fh(String is_cat_fh) {
        this.is_cat_fh = is_cat_fh;
    }

    public String getIs_uhd() {
        return is_uhd;
    }

    public void setIs_uhd(String is_uhd) {
        this.is_uhd = is_uhd;
    }

    public String getIs_cat_uhd() {
        return is_cat_uhd;
    }

    public void setIs_cat_uhd(String is_cat_uhd) {
        this.is_cat_uhd = is_cat_uhd;
    }

    public String getNsc_gb() {
        return nsc_gb;
    }

    public void setNsc_gb(String nsc_gb) {
        this.nsc_gb = nsc_gb;
    }

    public String getPoint_watcha() {
        return point_watcha;
    }

    public void setPoint_watcha(String point_watcha) {
        this.point_watcha = point_watcha;
    }

    public String getPoint_cine21() {
        return point_cine21;
    }

    public void setPoint_cine21(String point_cine21) {
        this.point_cine21 = point_cine21;
    }

    public String getChannel_num() {
        return channel_num;
    }

    public void setChannel_num(String channel_num) {
        this.channel_num = channel_num;
    }

    public String getCategory_type() {
        return category_type;
    }

    public void setCategory_type(String category_type) {
        this.category_type = category_type;
    }

    public String getKids_grade() {
        return kids_grade;
    }

    public void setKids_grade(String kids_grade) {
        this.kids_grade = kids_grade;
    }

    public String getCategory_sub_name() {
        return category_sub_name;
    }

    public void setCategory_sub_name(String category_sub_name) {
        this.category_sub_name = category_sub_name;
    }

    public String getOrder_yn() {
        return order_yn;
    }

    public void setOrder_yn(String order_yn) {
        this.order_yn = order_yn;
    }

    public String getSer_album_id() {
        return ser_album_id;
    }

    public void setSer_album_id(String ser_album_id) {
        this.ser_album_id = ser_album_id;
    }

    public String getStill_url() {
        return still_url;
    }

    public void setStill_url(String still_url) {
        this.still_url = still_url;
    }

    public String getMain_img_file() {
        return main_img_file;
    }

    public void setMain_img_file(String main_img_file) {
        this.main_img_file = main_img_file;
    }

    public String getLogo_image_file() {
        return logo_image_file;
    }

    public void setLogo_image_file(String logo_image_file) {
        this.logo_image_file = logo_image_file;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(result_type);
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(type);
        dest.writeString(img_url);
        dest.writeString(img_file_name);
        dest.writeString(parent_cat_id);
        dest.writeString(auth_yn);
        dest.writeString(cha_num);
        dest.writeString(cat_level);
        dest.writeString(price);
        dest.writeString(exist_sub_cat);
        dest.writeString(pr_info);
        dest.writeString(runtime);
        dest.writeString(is_51_ch);
        dest.writeString(is_new);
        dest.writeString(is_update);
        dest.writeString(is_hot);
        dest.writeString(is_caption);
        dest.writeString(is_hd);
        dest.writeString(is_continous_play);
        dest.writeString(point);
        dest.writeString(sub_cnt);
        dest.writeString(close_yn);
        dest.writeString(svod_yn);
        dest.writeString(_3D_yn);
        dest.writeString(service_gb);
        dest.writeString(filter_gb);
        dest.writeString(pps_yn);
        dest.writeString(cat_desc);
        dest.writeString(is_order);
        dest.writeString(no_cache);
        dest.writeString(animation_img_file);
        dest.writeString(ppm_yn);
        dest.writeString(ppm_prod_id);
        dest.writeString(test_sbc);
        dest.writeString(point_count);
        dest.writeString(cat_img_type);
        dest.writeString(img_Url);
        dest.writeString(img_file_name_h);
        dest.writeString(img_file_name_v);
        dest.writeString(i30_point);
        dest.writeString(suggested_price);
        dest.writeString(is_fh);
        dest.writeString(is_cat_fh);
        dest.writeString(is_uhd);
        dest.writeString(is_cat_uhd);
        dest.writeString(nsc_gb);
        dest.writeString(point_watcha);
        dest.writeString(point_cine21);
        dest.writeString(channel_num);
        dest.writeString(category_type);
        dest.writeString(kids_grade);
        dest.writeString(category_sub_name);
        dest.writeString(order_yn);
        dest.writeString(ser_album_id);
        dest.writeString(still_url);
        dest.writeString(main_img_file);
        dest.writeString(logo_image_file);
    }
}
