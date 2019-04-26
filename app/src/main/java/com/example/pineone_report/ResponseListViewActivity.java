package com.example.pineone_report;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

import static com.example.pineone_report.ServerCommand.SERVER_CMD_IMCS_GETI30CONTLIST;
import static com.example.pineone_report.ServerCommand.SERVER_CMD_IMCS_GETI30LIST;

public class ResponseListViewActivity extends AppCompatActivity {

    ArrayList<ResponseListViewItem> items = new ArrayList<ResponseListViewItem>();

    LinearLayoutManager linearLayoutManager;
    ResponseListViewAdapter adapter;
    RecyclerView recyclerView;

    String tmp = "";
    ServerCommand serverCommand;
    GetI30ContList getI30ContList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response_list_view);

        serverCommand = (ServerCommand)getIntent().getSerializableExtra("ServerCommand");
        prepareData();

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        adapter = new ResponseListViewAdapter(items);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, 1));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void prepareData() {
        switch(serverCommand) {
            case SERVER_CMD_IMCS_GETI30CONTLIST:
                getI30ContList = getIntent().getParcelableExtra("GetI30ContList");

                items.add(new ResponseListViewItem("ALBUM_ID", getI30ContList.getAlbum_id(), ""));
                items.add(new ResponseListViewItem("ALBUM_NAME", getI30ContList.getAlbum_name(), ""));
                items.add(new ResponseListViewItem("CHA_NUM", getI30ContList.getCha_num(), ""));
                items.add(new ResponseListViewItem("IMG_FILE_NAME_H", getI30ContList.getImg_file_name_h(), ""));
                items.add(new ResponseListViewItem("IMG_FILE_NAME_V", getI30ContList.getImg_file_name_v(), ""));
                items.add(new ResponseListViewItem("RUNTIME", getI30ContList.getRuntime(), ""));
                items.add(new ResponseListViewItem("PR_INFO", getI30ContList.getPr_info(), "01 : 일반\n" +
                        "02 : 7세이상\n" +
                        "03 : 12세이상\n" +
                        "04 : 15세이상\n" +
                        "05 : 19세이상\n" +
                        "06 : 방송불가"));
                items.add(new ResponseListViewItem("KIDS_GRADE", getI30ContList.getKids_grade(), "1 ~ 7 : 1세 ~ 7세"));
                items.add(new ResponseListViewItem("IS_51_CH", getI30ContList.getIs_51_ch(), "5.1Ch 여부"));
                items.add(new ResponseListViewItem("SYNOPSIS", getI30ContList.getSynopsis(), ""));
                items.add(new ResponseListViewItem("IS_NEW", getI30ContList.getIs_new(), "YYYYMMDDHH"));
                items.add(new ResponseListViewItem("IS_UPDATE", getI30ContList.getIs_update(), "YYYYMMDDHH"));
                items.add(new ResponseListViewItem("IS_HOT", getI30ContList.getIs_hot(), "Y, N"));
                items.add(new ResponseListViewItem("OVERSEER_NAME", getI30ContList.getOverseer_name(), ""));
                items.add(new ResponseListViewItem("ACTOR", getI30ContList.getActor(), "“신하균,임하룡”"));
                items.add(new ResponseListViewItem("IS_CAPTION", getI30ContList.getIs_caption(), "N : 없음\n" +
                        "Y : 자막\n" +
                        "D : 더빙"));
                items.add(new ResponseListViewItem("IS_HD", getI30ContList.getIs_hd(), "Y : HD"));
                items.add(new ResponseListViewItem("EVENT_TYPE", getI30ContList.getEvent_type(), "값 : 1 ~\n" +
                        "값이 N 으로 내려오면 이벤트 상품 아님"));
                items.add(new ResponseListViewItem("POINT", getI30ContList.getPoint(), "정수(0~10)"));
                items.add(new ResponseListViewItem("SERIES_NO", getI30ContList.getSeries_no(), ""));
                items.add(new ResponseListViewItem("SER_DISP_YN", getI30ContList.getSer_disp_yn(), "Y/N"));
                items.add(new ResponseListViewItem("ONAIR_DATE", getI30ContList.getOnair_date(), "2010/5/5(수)"));
                items.add(new ResponseListViewItem("SERIES_DESC", getI30ContList.getSeries_desc(), "1회"));
                items.add(new ResponseListViewItem("CONTS_TYPE", getI30ContList.getCont_type(), "0 : FVOD (Free VOD)\n" +
                        "1 : PPV (Pay Per View)\n" +
                        "2 : PVOD (Package VOD)\n" +
                        "3 : SVOD (Subcription VOD)\n" +
                        "7 : PPM(월정액)\n" +
                        "CONTS_TYPE1\\B\n" +
                        "CONTS_TYPE2\n" +
                        "멀티월정액 \n" +
                        "1\\B7\\B7\\B8"));
                items.add(new ResponseListViewItem("3D_YN", getI30ContList.getIs_3d_yn(), "Y, N"));
                items.add(new ResponseListViewItem("EVENT_VALUE", getI30ContList.getEvent_value(), "30, 10"));
                items.add(new ResponseListViewItem("BROADCAST_YN", getI30ContList.getBroadcast_yn(), "방영:’Y’\n" +
                        "결방:’N’\n" +
                        "조기종영:’E’ \n" +
                        "지연:’D’\n" +
                        "서비스 중지: ’X’"));
                items.add(new ResponseListViewItem("PREVIEW_YN", getI30ContList.getPreview_yn(), "Y, N"));
                items.add(new ResponseListViewItem("SERVICE_GB", getI30ContList.getService_gb(), "<IPTV인 경우>\n" + "ENT : 이벤트\n" + "HOT\n" + "NEW\n" + "DIS : 할인\n" + "END : 종영\n" + "FIN : 종료\n" + "DEL : 삭제임박\n" + "STP : 종방\n" + "OPN : 동시개봉->동시상영\n" + "NOC : 무삭제\n" + "FHD : 블루레이컨텐츠\n" + "EXC : 독점\n" + "SOL : 단독\n" + "FIR : 최초개봉\n" + "UHD : UHD(4K)\n" + "<UFLIX인 경우>\n" + "ENT : 이벤트\n" + "HOT : HOT\n" + "NEW : NEW\n" + "DIS : 할인\n" + "END : 종영\n" + "FIN : 종료\n" + "DEL : 삭제임박\n" + "STP : 종방\n" + "OPN : 동시개봉 \n" + "NOC : 무삭제\n" + "FHD : 블루레이컨텐츠\n" + "EXC : 독점\n" + "SOL : 단독\n" + "FIR : 최초개봉\n" + "FRE : Free\n" + "D10 : 10%할인\n" + "D30 : 30%할인\n" + "D50 : 50%할인\n" + "PRE : 프리미엄\n" + "SPE : 특집\n" + "UHD : UHD컨텐츠\n" + "NFR : HDTV전용 최초개봉\n" + "NHT : HDTV전용 HOT\n" + "NNW : HDTV전용 NEW\n" + "NON : HDTV전용 동시개봉\n" + "NFN : HDTV전용 종료\n" + "NET : HDTV전용 이벤트\n" + "NED : HDTV전용 종영\n" + "NDL : HDTV전용 삭제임박\n" + "NDS : HDTV전용 할인\n" + "NNC : HDTV전용 무삭제\n" + "NSP : HDTV전용 종방\n" + "F85 : 85무료\n" + "FVA : 월정무료\n" + "A01 : EVENT\n" + "A02 : 프리미엄\n" + "A03 : 특집\n" + "A04 : 종영\n" + "A05 : 무삭제\n" + "A06 : 독점\n" + "A07 : POWER\n" + "A08 : 파워블로거\n" + "A09 : 유투버\n" + "A10 : 스페셜\n" + "A11 : 할인\n" + "A12 : 파격할인\n" + "A13 : 가격인하\n" + "A14 : 20%할인\n" + "A15 : 인기\n" + "A16 : 추천\n" + "A17 : 지식팩\n" + "A18 : 최저가\n" + "A19 : 첫회무료\n" + "A20 : 전편무료\n" + "A21 : YBM추천\n" + "A22 : 해커스추천\n" + "A23 : 판매1위\n" + "A24 : 실검1위\n" + "A25 : 다국어자막\n" + "A26 : 360도\n" + "A40 : 영어자막"));
                items.add(new ResponseListViewItem("APP_TYPE", getI30ContList.getApp_type(), "<R>\n" + "G : tvG\n" + "R : U+HDTV\n" + "M : SmartTV(STB Free)\n" + "S : 소프트리모컨\n" + "X : Uflix\n" + "T : 2nd TV\n" + "H : tvG 2.0\n" + "I : I20\n" + "U : U+BOX\n" + "P : 프로야구\n" + "Z : Unknown\n" + "B : 보급형\n" + "N : I30 (Next UX)\n" + "<A>\n" + "U : 자사고객\n" + "S : SK고객\n" + "K : KT고객\n" + "O : 타사고객\n" + "Z : Unknown\n" + "<B>\n" + "S : 스마트폰\n" + "P : PAD\n" + "C : PC\n" + "T : 자사 STB\n" + "V : 홈보이\n" + "O : 타사 STB\n" + "U : U+CAST\n" + "D : 그외 동글\n" + "M : SmartTV\n" + "Z : Unknown\n" + "<C>\n" + "I : IOS\n" + "A : 안드로이드\n" + "W : 윈도우\n" + "L : 리눅스\n" + "O : webOS\n" + "Z : Unknown"));
                items.add(new ResponseListViewItem("TERR_YN", getI30ContList.getTerr_yn(), "0: 지상파 / 1: 일반 PPV"));
                items.add(new ResponseListViewItem("TERR_ED_DATE", getI30ContList.getTerr_ed_date(), "YYYYMMDDHH"));

                if(getI30ContList.getStill_file_names().size() == 0) {
                    items.add(new ResponseListViewItem("STILL_FILE_NAME", tmp, "Ex)STILL_IMG_FILE_NAME\\bSTILL_IMG_FILE_NAME\\bSTILL_IMG_FILE_NAME\\bSTILL_IMG_FILE_NAME"));
                } else {
                    for(int i = 0; i < getI30ContList.getStill_file_names().size(); i++) {
                        tmp += getI30ContList.getStill_file_names().get(i);
                        if(i == getI30ContList.getStill_file_names().size()-1) break;
                        tmp += "\n";
                    }
                    items.add(new ResponseListViewItem("STILL_FILE_NAME", tmp, "Ex)STILL_IMG_FILE_NAME\\bSTILL_IMG_FILE_NAME\\bSTILL_IMG_FILE_NAME\\bSTILL_IMG_FILE_NAME"));
                    tmp = "";
                }

                if(getI30ContList.getUrls().size() == 0) {
                    items.add(new ResponseListViewItem("URL", tmp, "EX) TRAILER_SERVER1\\b\n" +
                            "TRAILER _SERVER2\\b\n" +
                            "TRAILER _SERVER3\n" +
                            "(메인 \\b 인접 \\b 중앙) \n" +
                            "서버 아이피"));
                } else {
                    for(int i = 0; i < getI30ContList.getUrls().size(); i++) {
                        tmp += getI30ContList.getUrls().get(i);
                        if(i == getI30ContList.getUrls().size()-1) break;
                        tmp += "\n";
                    }
                    items.add(new ResponseListViewItem("URL", tmp, "EX) TRAILER_SERVER1\\b\n" +
                            "TRAILER _SERVER2\\b\n" +
                            "TRAILER _SERVER3\n" +
                            "(메인 \\b 인접 \\b 중앙) \n" +
                            "서버 아이피"));
                    tmp = "";
                }

                if(getI30ContList.getFile_names().size() == 0) {
                    items.add(new ResponseListViewItem("FILE_NAME", tmp, "Ex)TRAILER_FILE_NAME\\b TRAILER_FILE_NAME"));
                } else {
                    for(int i = 0; i < getI30ContList.getFile_names().size(); i++) {
                        tmp += getI30ContList.getFile_names().get(i);
                        if(i == getI30ContList.getFile_names().size()-1) break;
                        tmp += "\n";
                    }
                    items.add(new ResponseListViewItem("FILE_NAME", tmp, "Ex)TRAILER_FILE_NAME\\b TRAILER_FILE_NAME"));
                    tmp = "";
                }

                if(getI30ContList.getFile_sizes().size() == 0) {
                    items.add(new ResponseListViewItem("FILE_SIZE", tmp, "Ex)TRAILER_FILE_SIZE\\bTRAILER_FILE_SIZE"));
                } else {
                    for(int i = 0; i < getI30ContList.getFile_sizes().size(); i++) {
                        tmp += getI30ContList.getFile_sizes().get(i);
                        if(i == getI30ContList.getFile_sizes().size()-1) break;
                        tmp += "\n";
                    }
                    items.add(new ResponseListViewItem("FILE_SIZE", tmp, "Ex)TRAILER_FILE_SIZE\\bTRAILER_FILE_SIZE"));
                    tmp = "";
                }

                if(getI30ContList.getContents_ids().size() == 0) {
                    items.add(new ResponseListViewItem("CONTENTS_ID", tmp, "Ex)CONTENTS_ID\\bCONTENTS_ID"));
                } else {
                    for(int i = 0; i < getI30ContList.getContents_ids().size(); i++) {
                        tmp += getI30ContList.getContents_ids().get(i);
                        if(i == getI30ContList.getContents_ids().size()-1) break;
                        tmp += "\n";
                    }
                    items.add(new ResponseListViewItem("CONTENTS_ID", tmp, "Ex)CONTENTS_ID\\bCONTENTS_ID"));
                    tmp = "";
                }

                if(getI30ContList.getContents_names().size() == 0) {
                    items.add(new ResponseListViewItem("CONTENTS_NAME", tmp, "Ex)CONTENTS_NAME\\b CONTENTS_NAME"));
                } else {
                    for(int i = 0; i < getI30ContList.getContents_names().size(); i++) {
                        tmp += getI30ContList.getContents_names().get(i);
                        if(i == getI30ContList.getContents_names().size()-1) break;
                        tmp += "\n";
                    }
                    items.add(new ResponseListViewItem("CONTENTS_NAME", tmp, "Ex)CONTENTS_NAME\\b CONTENTS_NAME"));
                    tmp = "";
                }

                items.add(new ResponseListViewItem("LAST_WATCH_YN", getI30ContList.getLast_watch_yn(), "Y, N"));
                items.add(new ResponseListViewItem("FAVORITE_YN", getI30ContList.getFavorite_yn(), "Y, N"));
                items.add(new ResponseListViewItem("2NDTV_RIGHT_YN", getI30ContList.getSecondtv_right_yn(), "Y, N\n" +
                        "2nd TV 에서 구매/시청이 가능한 컨텐츠의 경우 ‘N’, \n" +
                        "구매/시청불가 ‘Y’"));
                items.add(new ResponseListViewItem("POINT_COUNT", getI30ContList.getPoint_count(), ""));

                if(getI30ContList.getBack_file_names().size() == 0) {
                    items.add(new ResponseListViewItem("BACK_FILE_NAME", tmp, "Ex)BACK_IMG_FILE_NAME\\bBACK_IMG_FILE_NAME"));
                } else {
                    for(int i = 0; i < getI30ContList.getBack_file_names().size(); i++) {
                        tmp += getI30ContList.getBack_file_names().get(i);
                        if(i == getI30ContList.getBack_file_names().size()-1) break;
                        tmp += "\n";
                    }
                    items.add(new ResponseListViewItem("BACK_FILE_NAME", tmp, "Ex)BACK_IMG_FILE_NAME\\bBACK_IMG_FILE_NAME"));
                    tmp = "";
                }

                items.add(new ResponseListViewItem("IMG_URL", getI30ContList.getImg_url(), "이미지 서버 아이피"));
                items.add(new ResponseListViewItem("ONAIR_DATE", getI30ContList.getOnair_date(), "YYYYMMDD"));
                items.add(new ResponseListViewItem("PLAYER", getI30ContList.getPlayer(), ""));
                items.add(new ResponseListViewItem("PRODUCER", getI30ContList.getProducer(), ""));
                items.add(new ResponseListViewItem("DIRECTOR_DISPLAY", getI30ContList.getDirectorDisplay(), ""));
                items.add(new ResponseListViewItem("RELEASE_DATE", getI30ContList.getReleaseDate(), "다큐(뮤직)일 경우 :\n" +
                        " “발매일”"));
                items.add(new ResponseListViewItem("STARRING_ACTOR", getI30ContList.getStarringActor(), ""));
                items.add(new ResponseListViewItem("RECOMMENDATION_AGE", getI30ContList.getRecommendationAge(), ""));
                items.add(new ResponseListViewItem("VOICE_ACTOR", getI30ContList.getVoiceActor(), ""));
                items.add(new ResponseListViewItem("STUDIO", getI30ContList.getStudio(), ""));
                items.add(new ResponseListViewItem("ALBUM_MUSIC", getI30ContList.getAlbumMusic(), ""));
                items.add(new ResponseListViewItem("GENRE_TYPE", getI30ContList.getGenreType(), "1. 지상파\n" +
                        "2. 일반(영화)\n" +
                        "3. 일반(애니)\n" +
                        "4. 키즈/교육\n" +
                        "5. 키즈/교육(애니)\n" +
                        "6. 다큐/라이프\n" +
                        "7. 다큐/라이프(뮤직)"));
                items.add(new ResponseListViewItem("IS_FH", getI30ContList.getIs_fh(), "Y, N, H(HDR컨텐츠)"));
                items.add(new ResponseListViewItem("IS_ UHD", getI30ContList.getIs_uhd(), "Y, N"));
                items.add(new ResponseListViewItem("GENRE_LARGE", getI30ContList.getGenre_large(), "영화/교육"));
                items.add(new ResponseListViewItem("GENRE_INFO", getI30ContList.getGenre_info(), "드라마, 코미디"));
                items.add(new ResponseListViewItem("RETURN_PAGE_NO", getI30ContList.getReturn_page_no(), "예) 시리즈 (전체 98개 컨텐츠로 구성) PAGE_CNT =10(리스트갯수), PAGE_NO =0 으로 호출\n" +
                        "1. 마지막 시청 회차 존재할 경우(77화 시청시) : 98(전체컨텐츠갯수)/10(요청 리스트갯수) =총 10 PAGE로 구성됨, 마지막 10 PAGE는 8개 컨텐츠로 구성, 따라서 RETURN_PAGE_NO 는 7\n" +
                        "2. 종영작일 경우: 1\n" +
                        "3. 상영작일 경우: 10"));
                items.add(new ResponseListViewItem("QD_FLAG", getI30ContList.getQd_flag(), "0 : 검수(배포시작)\n" +
                        "1 : 시작후 10분\n" +
                        "2 : 종료후 10분(배포완료)"));
                items.add(new ResponseListViewItem("SMI_LANGUAGE", getI30ContList.getSmi_language(), "한국어;영어;중국어;일어;독일어;프랑스어;스페인어;"));
                items.add(new ResponseListViewItem("LINK_WATCHA", getI30ContList.getLink_watcha(), ""));
                items.add(new ResponseListViewItem("CP_PROPERTY", getI30ContList.getCp_property(), "4.7.1. CP별 속성제어 값 참조"));
                items.add(new ResponseListViewItem("PREVIEW_FLAG", getI30ContList.getPreview_flag(), "P : 예약정보\n" +
                        "R : 예약구매\n" +
                        "V : 시청가능 (검수 STB 예약구매 전용 사용)\n" +
                        "N : 시청가능\n" +
                        "X : 판매중지\n" +
                        "\n" +
                        "※ Default N\n" +
                        "※ V:검수STB & 예약구매 & 물리파일이 입수되었을 경우\n" +
                        "     미구매시 예약구매, 구매시에는 시청 가능\n" +
                        "     (시청가능일 이전이라도 시청 가능한 FLAG)"));
                items.add(new ResponseListViewItem("PRICE", getI30ContList.getPrice(), "유료 컨텐츠 : Y - FVOD를 제외한 모든 컨텐츠\n" +
                        "무료 컨텐츠 : N - FVOD 컨텐츠\n" +
                        "\n" +
                        "※ 제공되는 화질 중 하나라도 유료이면 Y(유료)"));
                items.add(new ResponseListViewItem("POINT_WATCHA", getI30ContList.getPoint_watcha(), "예시: 3.8609567095"));
                items.add(new ResponseListViewItem("POINT_CNT_WATCHA", getI30ContList.getPoint_cnt_watcha(), "별점 전체 평가자 수"));
                items.add(new ResponseListViewItem("RATING01_WATCHA", getI30ContList.getRating01_watcha(), "왓챠별점 0.5점에 대한 평가자수"));
                items.add(new ResponseListViewItem("RATING02_WATCHA", getI30ContList.getRating02_watcha(), "왓챠별점 1점에 대한 평가자수"));
                items.add(new ResponseListViewItem("RATING03_WATCHA", getI30ContList.getRating03_watcha(), "왓챠별점 1.5점에 대한 평가자수"));
                items.add(new ResponseListViewItem("RATING04_WATCHA", getI30ContList.getRating04_watcha(), "왓챠별점 2점에 대한 평가자수"));
                items.add(new ResponseListViewItem("RATING05_WATCHA", getI30ContList.getRating05_watcha(), "왓챠별점 2.5점에 대한 평가자수"));
                items.add(new ResponseListViewItem("RATING06_WATCHA", getI30ContList.getRating06_watcha(), "왓챠별점 3점에 대한 평가자수"));
                items.add(new ResponseListViewItem("RATING07_WATCHA", getI30ContList.getRating07_watcha(), "왓챠별점 3.5점에 대한 평가자수"));
                items.add(new ResponseListViewItem("RATING08_WATCHA", getI30ContList.getRating08_watcha(), "왓챠별점 4점에 대한 평가자수"));
                items.add(new ResponseListViewItem("RATING09_WATCHA", getI30ContList.getRating09_watcha(), "왓챠별점 4.5점에 대한 평가자수"));
                items.add(new ResponseListViewItem("RATING10_WATCHA", getI30ContList.getRating10_watcha(), "왓챠별점 5점에 대한 평가자수"));
                items.add(new ResponseListViewItem("COMMENT_CNT", getI30ContList.getComment_cnt(), ""));
                items.add(new ResponseListViewItem("CINE21_ID", getI30ContList.getCine21_id(), ""));
                items.add(new ResponseListViewItem("CINE21_RATING", getI30ContList.getCine21_rating(), ""));
                items.add(new ResponseListViewItem("CINE21_COUNT", getI30ContList.getCine21_count(), ""));
                items.add(new ResponseListViewItem("RESERVE_PRICE", getI30ContList.getReserve_price(), "구매 가격 정보 제공 안함\n" +
                        "값 : NULL(빈값)"));
                items.add(new ResponseListViewItem("RESERVE_VIEW_DATE", getI30ContList.getReserve_view_date(), "YYYYMMDD"));
                items.add(new ResponseListViewItem("RESERVE_DELAY_YN", getI30ContList.getReserve_delay_yn(), "Y/N (null : 해당없음)"));
                break;
        }
    }
}
