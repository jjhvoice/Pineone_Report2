package com.example.pineone_report;

import android.util.Log;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ServerParser {

    String Total_cnt;
    String result_type;

    GetI30List getI30List;
    GetI30ContList getI30ContList;
    ArrayList<GetI30List> getI30Lists;
    ArrayList<GetI30ContList> getI30ContLists;

    public ServerParser() {

    }

    public ArrayList<GetI30List> getParseGetI30List(String serverData) {
        getI30Lists = new ArrayList<GetI30List>();
        StringTokenizer stringTokenizer = new StringTokenizer(serverData, "\f");

        while (stringTokenizer.hasMoreTokens()) {
            int indexFront = 0;
            int indexRear = 0;

            String item = stringTokenizer.nextToken();
            getI30List = new GetI30List();

            for (int i = 0; ; ++i) {
                indexRear = item.indexOf("|", indexFront);

                if (indexRear == -1) {
                    if(item != null && item.equals("END_STR"))
                    {
                        getI30List.setResult_type(item);
                    }
                    break;
                }

                String data = item.substring(indexFront, indexRear);

                indexFront = indexRear + 1;

                switch (i) {
                    case 0:
                        getI30List.setResult_type(data);
                        break;
                    case 1:
                        getI30List.setId(data);
                        break;
                    case 2:
                        getI30List.setName(data);
                        break;
                    case 3:
                        getI30List.setType(data);
                        break;
                    case 4:
                        getI30List.setImg_url(data);
                        break;
                    case 5:
                        getI30List.setImg_file_name(data);
                        break;
                    case 6:
                        getI30List.setParent_cat_id(data);
                        break;
                    case 7:
                        getI30List.setAuth_yn(data);
                        break;
                    case 8:
                        getI30List.setCha_num(data);
                        break;
                    case 9:
                        getI30List.setCat_level(data);
                        break;
                    case 10:
                        getI30List.setPrice(data);
                        break;
                    case 11:
                        getI30List.setExist_sub_cat(data);
                        break;
                    case 12:
                        getI30List.setPr_info(data);
                        break;
                    case 13:
                        getI30List.setRuntime(data);
                        break;
                    case 14:
                        getI30List.setIs_51_ch(data);
                        break;
                    case 15:
                        getI30List.setIs_new(data);
                        break;
                    case 16:
                        getI30List.setIs_update(data);
                        break;
                    case 17:
                        getI30List.setIs_hot(data);
                        break;
                    case 18:
                        getI30List.setIs_caption(data);
                        break;
                    case 19:
                        getI30List.setIs_hd(data);
                        break;
                    case 20:
                        getI30List.setIs_continous_play(data);
                        break;
                    case 21:
                        getI30List.setPoint(data);
                        break;
                    case 22:
                        getI30List.setSub_cnt(data);
                        break;
                    case 23:
                        getI30List.setClose_yn(data);
                        break;
                    case 24:
                        getI30List.setSvod_yn(data);
                        break;
                    case 25:
                        getI30List.set_3D_yn(data);
                        break;
                    case 26:
                        getI30List.setService_gb(data);
                        break;
                    case 27:
                        getI30List.setFilter_gb(data);
                        break;
                    case 28:
                        getI30List.setPps_yn(data);
                        break;
                    case 29:
                        getI30List.setCat_desc(data);
                        break;
                    case 30:
                        getI30List.setIs_order(data);
                        break;
                    case 31:
                        getI30List.setNo_cache(data);
                        break;
                    case 32:
                        getI30List.setAnimation_img_file(data);
                        break;
                    case 33:
                        getI30List.setPpm_yn(data);
                        break;
                    case 34:
                        getI30List.setPpm_prod_id(data);
                        break;
                    case 35:
                        getI30List.setTest_sbc(data);
                        break;
                    case 36:
                        getI30List.setPoint_count(data);
                        break;
                    case 37:
                        getI30List.setCat_img_type(data);
                        break;
                    case 38:
                        getI30List.setImg_Url(data);
                        break;
                    case 39:
                        getI30List.setImg_file_name_h(data);
                        break;
                    case 40:
                        getI30List.setImg_file_name_v(data);
                        break;
                    case 41:
                        getI30List.setI30_point(data);
                        break;
                    case 42:
                        getI30List.setSuggested_price(data);
                        break;
                    case 43:
                        getI30List.setIs_fh(data);
                        break;
                    case 44:
                        getI30List.setIs_cat_fh(data);
                        break;
                    case 45:
                        getI30List.setIs_uhd(data);
                        break;
                    case 46:
                        getI30List.setIs_cat_uhd(data);
                        break;
                    case 47:
                        getI30List.setNsc_gb(data);
                        break;
                    case 48:
                        getI30List.setPoint_watcha(data);
                        break;
                    case 49:
                        getI30List.setPoint_cine21(data);
                        break;
                    case 50:
                        getI30List.setChannel_num(data);
                        break;
                    case 51:
                        getI30List.setCategory_type(data);
                        break;
                    case 52:
                        getI30List.setKids_grade(data);
                        break;
                    case 53:
                        getI30List.setCategory_sub_name(data);
                        break;
                    case 54:
                        getI30List.setOrder_yn(data);
                        break;
                    case 55:
                        getI30List.setSer_album_id(data);
                        break;
                    case 56:
                        getI30List.setStill_url(data);
                        break;
                    case 57:
                        getI30List.setMain_img_file(data);
                        break;
                    case 58:
                        getI30List.setLogo_image_file(data);
                        break;
                }//switch

                if (indexFront >= item.length()) {
                    break;
                }
            }//for
            result_type = getI30List.getResult_type();
            if(result_type != null && result_type.equals("CAT")) getI30Lists.add(getI30List);
        }
        return getI30Lists;
    }

    public ArrayList<GetI30ContList> getParseGetI30ContList(String serverData) {
        getI30ContLists = new ArrayList<GetI30ContList>();
        StringTokenizer stringTokenizer = new StringTokenizer(serverData, "\f");
        Total_cnt = stringTokenizer.nextToken();

        while(stringTokenizer.hasMoreTokens()) {
            int indexFront = 0;
            int indexRear = 0;

            String item = stringTokenizer.nextToken();
            getI30ContList = new GetI30ContList();

            for (int i = 0; ; ++i) {
                indexRear = item.indexOf("|", indexFront);

                if (indexRear == -1) {
                    break;
                }

                String data = item.substring(indexFront, indexRear);

                indexFront = indexRear + 1;

                switch (i) {
                    case 0:
                        getI30ContList.setAlbum_id(data);
                        break;
                    case 1:
                        getI30ContList.setAlbum_name(data);
                        break;
                    case 2:
                        getI30ContList.setCha_num(data);
                        break;
                    case 3:
                        getI30ContList.setImg_file_name_h(data);
                        break;
                    case 4:
                        getI30ContList.setImg_file_name_v(data);
                        break;
                    case 5:
                        getI30ContList.setRuntime(data);
                    case 6:
                        getI30ContList.setPr_info(data);
                        break;
                    case 7:
                        getI30ContList.setKids_grade(data);
                        break;
                    case 8:
                        getI30ContList.setIs_51_ch(data);
                        break;
                    case 9:
                        getI30ContList.setSynopsis(data);
                        break;
                    case 10:
                        getI30ContList.setIs_new(data);
                        break;
                    case 11:
                        getI30ContList.setIs_update(data);
                        break;
                    case 12:
                        getI30ContList.setIs_hot(data);
                        break;
                    case 13:
                        getI30ContList.setOverseer_name(data);
                        break;
                    case 14:
                        getI30ContList.setActor(data);
                        break;
                    case 15:
                        getI30ContList.setIs_caption(data);
                        break;
                    case 16:
                        getI30ContList.setIs_hd(data);
                        break;
                    case 17:
                        getI30ContList.setEvent_type(data);
                        break;
                    case 18:
                        getI30ContList.setPoint(data);
                        break;
                    case 19:
                        getI30ContList.setSeries_no(data);
                        break;
                    case 20:
                        getI30ContList.setSer_disp_yn(data);
                        break;
                    case 21:
                        getI30ContList.setOnair_date(data);
                        break;
                    case 22:
                        getI30ContList.setSeries_desc(data);
                        break;
                    case 23:
                        getI30ContList.setCont_type(data);
                        break;
                    case 24:
                        getI30ContList.setIs_3d_yn(data);
                        break;
                    case 25:
                        getI30ContList.setEvent_value(data);
                        break;
                    case 26:
                        getI30ContList.setBroadcast_yn(data);
                        break;
                    case 27:
                        getI30ContList.setPreview_yn(data);
                        break;
                    case 28:
                        getI30ContList.setService_gb(data);
                        break;
                    case 29:
                        getI30ContList.setApp_type(data);
                        break;
                    case 30:
                        getI30ContList.setTerr_yn(data);
                        break;
                    case 31:
                        getI30ContList.setTerr_ed_date(data);
                        break;
                    case 32:
                        ArrayList<String> stillFilenameList = null;

                        if (data != null) {
                            StringTokenizer innerTokenizer = new StringTokenizer(data, "\b");

                            stillFilenameList = new ArrayList<String>();
                            while (innerTokenizer.hasMoreElements()) {
                                String stillFilename = (String) innerTokenizer.nextElement();
                                stillFilenameList.add(stillFilename);
                            }
                        }

                        getI30ContList.setStill_file_names(stillFilenameList);
                        break;
                    case 33:
                        ArrayList<String> urlList = null;

                        if (data != null) {
                            StringTokenizer innerTokenizer = new StringTokenizer(data, "\b");

                            urlList = new ArrayList<String>();
                            while (innerTokenizer.hasMoreElements()) {
                                String url = (String) innerTokenizer.nextElement();
                                urlList.add(url);
                            }
                        }

                        getI30ContList.setUrls(urlList);
                        break;
                    case 34:
                        ArrayList<String> filenameList = null;

                        if (data != null) {
                            StringTokenizer innerTokenizer = new StringTokenizer(data, "\b");

                            filenameList = new ArrayList<String>();
                            while (innerTokenizer.hasMoreElements()) {
                                String url = (String) innerTokenizer.nextElement();
                                filenameList.add(url);
                            }
                        }

                        getI30ContList.setFile_names(filenameList);
                        break;
                    case 35:
                        ArrayList<String> filesizeList = null;

                        if (data != null) {
                            StringTokenizer innerTokenizer = new StringTokenizer(data, "\b");

                            filesizeList = new ArrayList<String>();
                            while (innerTokenizer.hasMoreElements()) {
                                String filesize = (String) innerTokenizer.nextElement();
                                filesizeList.add(filesize);
                            }
                        }

                        getI30ContList.setFile_sizes(filesizeList);
                        break;
                    case 36:
                        ArrayList<String> contentIdList = null;

                        if (data != null) {
                            StringTokenizer innerTokenizer = new StringTokenizer(data, "\b");

                            contentIdList = new ArrayList<String>();
                            while (innerTokenizer.hasMoreElements()) {
                                String contentId = (String) innerTokenizer.nextElement();
                                contentIdList.add(contentId);
                            }
                        }

                        getI30ContList.setContents_ids(contentIdList);
                        break;
                    case 37:
                        ArrayList<String> contentNameList = null;

                        if (data != null) {
                            StringTokenizer innerTokenizer = new StringTokenizer(data, "\b");

                            contentNameList = new ArrayList<String>();
                            while (innerTokenizer.hasMoreElements()) {
                                String contentName = (String) innerTokenizer.nextElement();
                                contentNameList.add(contentName);
                            }
                        }

                        getI30ContList.setContents_names(contentNameList);
                        break;
                    case 38:
                        getI30ContList.setLast_watch_yn(data);
                        break;
                    case 39:
                        getI30ContList.setFavorite_yn(data);
                        break;
                    case 40:
                        getI30ContList.setSecondtv_right_yn(data);
                        break;
                    case 41:
                        getI30ContList.setPoint_count(data);
                        break;
                    case 42:
                        ArrayList<String> backFilenameList = null;

                        if (data != null) {
                            StringTokenizer innerTokenizer = new StringTokenizer(data, "\b");

                            backFilenameList = new ArrayList<String>();
                            while (innerTokenizer.hasMoreElements()) {
                                String backFilename = (String) innerTokenizer.nextElement();
                                backFilenameList.add(backFilename);
                            }
                        }

                        getI30ContList.setBack_file_names(backFilenameList);
                        break;
                    case 43:
                        getI30ContList.setImg_url(data);
                        break;
                    case 44:
                        getI30ContList.setOnAirDate2(data);
                        break;
                    case 45:
                        getI30ContList.setPlayer(data);
                        break;
                    case 46:
                        getI30ContList.setProducer(data);
                        break;
                    case 47:
                        getI30ContList.setDirectorDisplay(data);
                        break;
                    case 48:
                        getI30ContList.setReleaseDate(data);
                        break;
                    case 49:
                        getI30ContList.setStarringActor(data);
                        break;
                    case 50:
                        getI30ContList.setRecommendationAge(data);
                        break;
                    case 51:
                        getI30ContList.setVoiceActor(data);
                        break;
                    case 52:
                        getI30ContList.setStudio(data);
                        break;
                    case 53:
                        getI30ContList.setAlbumMusic(data);
                        break;
                    case 54:
                        getI30ContList.setGenreType(data);
                        break;
                    //MSLEE FULLHD 화질추가
                    case 55:
                        getI30ContList.setIs_fh(data);
                        break;
                    case 56 :
                        getI30ContList.setIs_uhd(data);
                        break;
                    case 57 :
                        getI30ContList.setGenre_large(data);
                        break;
                    case 58 :
                        getI30ContList.setGenre_info(data);
                        break;
                    case 59 :
                        getI30ContList.setReturn_page_no(data);
                        break;
                    case 60 :
                        getI30ContList.setQd_flag(data);
                        break;
                    case 61:
                        getI30ContList.setSmi_language(data);
                        break;
                    case 62:
                        getI30ContList.setLink_watcha(data);
                        break;
                    case 63:
                        getI30ContList.setCp_property(data);
                        break;

                    case 64:
                        getI30ContList.setPreview_flag(data);
                        break;
                    case 65:
                        getI30ContList.setPrice(data);
                        break;

                    case 66:
                        getI30ContList.setPoint_watcha(data);
                        break;
                    case 67:
                        getI30ContList.setPoint_cnt_watcha(data);
                        break;
                    case 68:
                        getI30ContList.setRating01_watcha(data);
                        break;
                    case 69:
                        getI30ContList.setRating02_watcha(data);
                        break;
                    case 70:
                        getI30ContList.setRating03_watcha(data);
                        break;
                    case 71:
                        getI30ContList.setRating04_watcha(data);
                        break;
                    case 72:
                        getI30ContList.setRating05_watcha(data);
                        break;
                    case 73:
                        getI30ContList.setRating06_watcha(data);
                        break;
                    case 74:
                        getI30ContList.setRating07_watcha(data);
                        break;
                    case 75:
                        getI30ContList.setRating08_watcha(data);
                        break;
                    case 76:
                        getI30ContList.setRating09_watcha(data);
                        break;
                    case 77:
                        getI30ContList.setRating10_watcha(data);
                        break;
                    case 78:
                        getI30ContList.setComment_cnt(data);
                        break;
                    case 79:
                        getI30ContList.setCine21_id(data);
                        break;
                    case 80:
                        getI30ContList.setCine21_rating(data);
                        break;
                    case 81:
                        getI30ContList.setCine21_count(data);
                        break;
                    case 82:
                        getI30ContList.setReserve_price(data);
                        break;
                    case 83:
                        getI30ContList.setReserve_view_date(data);
                        break;
                    case 84:
                        getI30ContList.setReserve_delay_yn(data);
                        break;
                    case 85:
                        getI30ContList.setNscreen_yn(data);
                        break;
                }
                if (indexFront >= item.length()) {
                    break;
                }
            }
            getI30ContLists.add(getI30ContList);
        }
        return getI30ContLists;
    }
}
