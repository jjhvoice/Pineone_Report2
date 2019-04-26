package com.example.pineone_report;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class GetI30ContList implements Parcelable {
    @Override
    public String toString() {
        return "GetI30ContList{" +
                "album_id='" + album_id + '\'' +
                ", album_name='" + album_name + '\'' +
                ", cha_num='" + cha_num + '\'' +
                ", img_file_name_h='" + img_file_name_h + '\'' +
                ", img_file_name_v='" + img_file_name_v + '\'' +
                ", runtime='" + runtime + '\'' +
                ", pr_info='" + pr_info + '\'' +
                ", kids_grade='" + kids_grade + '\'' +
                ", is_51_ch='" + is_51_ch + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", is_new='" + is_new + '\'' +
                ", is_update='" + is_update + '\'' +
                ", is_hot='" + is_hot + '\'' +
                ", overseer_name='" + overseer_name + '\'' +
                ", actor='" + actor + '\'' +
                ", is_caption='" + is_caption + '\'' +
                ", is_hd='" + is_hd + '\'' +
                ", event_type='" + event_type + '\'' +
                ", point='" + point + '\'' +
                ", series_no='" + series_no + '\'' +
                ", ser_disp_yn='" + ser_disp_yn + '\'' +
                ", onair_date='" + onair_date + '\'' +
                ", series_desc='" + series_desc + '\'' +
                ", cont_type='" + cont_type + '\'' +
                ", is_3d_yn='" + is_3d_yn + '\'' +
                ", event_value='" + event_value + '\'' +
                ", broadcast_yn='" + broadcast_yn + '\'' +
                ", preview_yn='" + preview_yn + '\'' +
                ", service_gb='" + service_gb + '\'' +
                ", app_type='" + app_type + '\'' +
                ", terr_yn='" + terr_yn + '\'' +
                ", terr_ed_date='" + terr_ed_date + '\'' +
                ", still_file_names=" + still_file_names +
                ", urls=" + urls +
                ", file_names=" + file_names +
                ", file_sizes=" + file_sizes +
                ", contents_ids=" + contents_ids +
                ", contents_names=" + contents_names +
                ", last_watch_yn='" + last_watch_yn + '\'' +
                ", favorite_yn='" + favorite_yn + '\'' +
                ", secondtv_right_yn='" + secondtv_right_yn + '\'' +
                ", point_count='" + point_count + '\'' +
                ", back_file_names=" + back_file_names +
                ", img_url='" + img_url + '\'' +
                ", onAirDate2='" + onAirDate2 + '\'' +
                ", player='" + player + '\'' +
                ", producer='" + producer + '\'' +
                ", directorDisplay='" + directorDisplay + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", starringActor='" + starringActor + '\'' +
                ", recommendationAge='" + recommendationAge + '\'' +
                ", voiceActor='" + voiceActor + '\'' +
                ", studio='" + studio + '\'' +
                ", albumMusic='" + albumMusic + '\'' +
                ", genreType='" + genreType + '\'' +
                ", is_fh='" + is_fh + '\'' +
                ", is_uhd='" + is_uhd + '\'' +
                ", genre_large='" + genre_large + '\'' +
                ", genre_info='" + genre_info + '\'' +
                ", return_page_no='" + return_page_no + '\'' +
                ", qd_flag='" + qd_flag + '\'' +
                ", smi_language='" + smi_language + '\'' +
                ", link_watcha='" + link_watcha + '\'' +
                ", cp_property='" + cp_property + '\'' +
                ", preview_flag='" + preview_flag + '\'' +
                ", price='" + price + '\'' +
                ", point_watcha='" + point_watcha + '\'' +
                ", point_cnt_watcha='" + point_cnt_watcha + '\'' +
                ", rating01_watcha='" + rating01_watcha + '\'' +
                ", rating02_watcha='" + rating02_watcha + '\'' +
                ", rating03_watcha='" + rating03_watcha + '\'' +
                ", rating04_watcha='" + rating04_watcha + '\'' +
                ", rating05_watcha='" + rating05_watcha + '\'' +
                ", rating06_watcha='" + rating06_watcha + '\'' +
                ", rating07_watcha='" + rating07_watcha + '\'' +
                ", rating08_watcha='" + rating08_watcha + '\'' +
                ", rating09_watcha='" + rating09_watcha + '\'' +
                ", rating10_watcha='" + rating10_watcha + '\'' +
                ", comment_cnt='" + comment_cnt + '\'' +
                ", cine21_id='" + cine21_id + '\'' +
                ", cine21_rating='" + cine21_rating + '\'' +
                ", cine21_count='" + cine21_count + '\'' +
                ", reserve_price='" + reserve_price + '\'' +
                ", reserve_view_date='" + reserve_view_date + '\'' +
                ", reserve_delay_yn='" + reserve_delay_yn + '\'' +
                ", nscreen_yn='" + nscreen_yn + '\'' +
                ", result_type='" + result_type + '\'' +
                ", event_info='" + event_info + '\'' +
                ", country='" + country + '\'' +
                ", genre_mid='" + genre_mid + '\'' +
                ", genre_small='" + genre_small + '\'' +
                ", summary1='" + summary1 + '\'' +
                ", summary2='" + summary2 + '\'' +
                ", is_hdr='" + is_hdr + '\'' +
                ", horz_poster_image='" + horz_poster_image + '\'' +
                ", mainImg='" + mainImg + '\'' +
                ", logoImg='" + logoImg + '\'' +
                ", prev_album_id='" + prev_album_id + '\'' +
                ", prev_album_name='" + prev_album_name + '\'' +
                ", still_img='" + still_img + '\'' +
                ", vod_file_name='" + vod_file_name + '\'' +
                ", vod_file_size='" + vod_file_size + '\'' +
                ", cap_file_name='" + cap_file_name + '\'' +
                ", cap_file_size='" + cap_file_size + '\'' +
                ", tot_cnt='" + tot_cnt + '\'' +
                ", series_id='" + series_id + '\'' +
                ", series_nm='" + series_nm + '\'' +
                ", series_info='" + series_info + '\'' +
                ", update_info='" + update_info + '\'' +
                ", still_url='" + still_url + '\'' +
                ", conts_img_url='" + conts_img_url + '\'' +
                ", caption_url='" + caption_url + '\'' +
                ", series_logo='" + series_logo + '\'' +
                ", pkg_yn='" + pkg_yn + '\'' +
                ", season_cat_id=" + season_cat_id +
                ", season_cat_nm=" + season_cat_nm +
                ", focus_album_id='" + focus_album_id + '\'' +
                ", current_page='" + current_page + '\'' +
                ", vod_server1='" + vod_server1 + '\'' +
                ", vod_server2='" + vod_server2 + '\'' +
                ", vod_server3='" + vod_server3 + '\'' +
                ", vod_server1_type='" + vod_server1_type + '\'' +
                ", vod_server2_type='" + vod_server2_type + '\'' +
                ", vod_server3_type='" + vod_server3_type + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", poster_url_old='" + poster_url_old + '\'' +
                '}';
    }

    private String album_id						= null; //01. 앨범ID
    private String album_name					= null; //02. 앨범제목
    private String cha_num						= null; //03. 단축채널번호
    private String img_file_name_h				= null; //04. 원본가로이미지    //(=HORZ_POSTER_IMAGE)
    private String img_file_name_v				= null; //05. 원본세로이미지
    private String runtime						= null; //06. 상영시간
    private String pr_info						= null; //07. 나이제한 (01: 일반, 02: 7세이상, 03: 12세이상, 04: 15세이상, 05: 19세이상, 06: 방송불가)
    private String kids_grade					= null; //08. 키즈등급
    private String is_51_ch						= null; //09. 5.1ch 여부
    private String synopsis						= null; //10. 영화해설(시놉시스)
    private String is_new						= null; //11. 신규 카테고리 등록여부 (YYYYMMDDHH)
    private String is_update					= null; //12. 카테고리의 등록 업데이트 여부, 컨텐츠일 경우 N (YYYYMMDDHH)
    private String is_hot						= null; //13. HOT상품여부 (Y, N)
    private String overseer_name				= null; //14. 감독
    private String actor						= null; //15. 출연 (신하균,임하룡)
    private String is_caption					= null; //16. 자막유뮤 (N: 없음, Y: 자막,D: 더빙)
    private String is_hd						= null; //17. HD 영상 구분 (Y : HD)
    private String event_type					= null; //18. 이벤트 타입정보 (값 : 1 ~, 값이 N 으로 내려오면 이벤트 상품 아님)
    private String point						= null; //19. 평점 (정수(0~10))
    private String series_no					= null; //20. 회차 (SM: 샘플, TS: 맛보기, PR: PR, FR: Free, PL: Plus, SP: 스페셜, 20: 일반)
    private String ser_disp_yn					= null; //21. 회차표시여부
    private String onair_date					= null; //22. 방영일 (2010/5/5(수))
    private String series_desc					= null; //23. 회차설명 (1회)
    private String cont_type					= null; //24. 컨텐츠타입 (0: FVOD, 1: PPV, 2: PVOD, 3: SVOD, 	7: PPM, CONTS_TYPE1\BCONTS_TYPE2, 멀티월정액	1\B7\B7\B8)
    private String is_3d_yn						= null; //25. 3D 여부 (Y, N)
    private String event_value					= null; //26. 이벤트 할인율 (30, 10)
    private String broadcast_yn					= null; //27. 방영여부 (방영:’Y’, 결방:’N’, 조기종영:’E’, 	지연:’D’)
    private String preview_yn					= null; //28. 예고편여부 (Y, N)
    private String service_gb					= null; //29. 서비스구분 (ENT: 이벤트, HOT, NEW, DIS: 할인, END: 종영, FIN: 종료, DEL: 삭제임박, STP: 종방, OPN: 동시개봉, NOC: 무삭제)
    private String app_type						= null; //30. APP타입 (...샘플생략...)
    private String terr_yn						= null; //31. 지상파 컨텐츠 여부 (0: 지상파 / 1: 일반 PPV)
    private String terr_ed_date					= null; //32. 지상파 컨텐츠 유료 종료일자 (YYYYMMDDHH)
    private ArrayList<String> still_file_names	= null; //33. 스틸이미지 파일명 (STILL_IMG_FILE_NAME\bSTILL_IMG_FILE_NAME\bSTILL_IMG_FILE_NAME)
    private ArrayList<String> urls				= null; //34. 예고편영상 URL (메인 \b 인접 \b 중앙	서버 아이피)
    private ArrayList<String> file_names		= null; //35. 예고편영상 파일명 (TRAILER_FILE_NAME\b TRAILER_FILE_NAME)
    private ArrayList<String> file_sizes		= null; //36. 예고편영상 파일사이즈 (TRAILER_FILE_SIZE\bTRAILER_FILE_SIZE)
    private ArrayList<String> contents_ids		= null; //37. 예고편영상 컨텐츠 ID (CONTENTS_ID\bCONTENTS_ID)
    private ArrayList<String> contents_names	= null; //38. 예고편영상 컨텐츠명 (CONTENTS_NAME\b CONTENTS_NAME)
    private String last_watch_yn				= null; //39. 해당 회차가 마지막 시청 앨범임 (Y, N)
    private String favorite_yn 					= null; //40. 찜목록 등록여부 (Y, N)
    private String secondtv_right_yn			= null; //41. 판권여부 (Y, N / 2nd TV 에서 구매/시청이 가능한 컨텐츠의 경우 'Y')
    private String point_count					= null; //42. 평점 N명 참여
    private ArrayList<String> back_file_names	= null; //43. 예고편영상 백그라운드 이미지 파일명 (BACK_IMG_FILE_NAME\bBACK_IMG_FILE_NAME)
    private String img_url						= null; //44. 포스터 URL (이미지 서버 아이피)
    private String onAirDate2					= null; //45. 방영정보 (YYYYMMDD)
    private String player						= null; //46. 출연진
    private String producer						= null; //47. 연출
    private String directorDisplay				= null; //48. 감독
    private String releaseDate					= null; //49. 개봉일
    private String starringActor				= null; //50. 주연
    private String recommendationAge			= null; //51. 추천연령
    private String voiceActor					= null; //52. 목소리
    private String studio						= null; //53. 제작사
    private String albumMusic					= null; //54. 앨범명
    private String genreType					= null; //55. 장르타입
    private String is_fh                        = null; //56. FULL HD 영상 구분 (Y,N)
    private String is_uhd						= null; //57. UHD(4K) 영상구분 (Y,N)
    private String genre_large					= null; // 58. 장르(1레벨)	영화/교육
    private String genre_info					= null; // 59. 대장르 카테고리명	드라마, 코미디
    private String return_page_no				= null; // 60. 페이징 기능 요청시 응답한 페이징 넘버
    private String qd_flag						= null; // 61. 퀵배포 진행상태
    private String smi_language            		= null; // 62. 다국어자막
    private String link_watcha              	= null; // 63. 왓차링크 url
    private String cp_property              	= null; // 64. cp별 속성 값

    private String preview_flag					= null; // 65. 예약정보 / 시청가능 정보
    private String price 						= null; // 66. 구매가격

    private String point_watcha             = null; // 67. 평점(왓차)
    private String point_cnt_watcha         = null; // 68. 별점 전체 평가자 수
    private String rating01_watcha          = null; // 69. 왓차별점 0.5점에 대한 평가자수
    private String rating02_watcha          = null; // 70. 왓차별점 1점에 대한 평가자수
    private String rating03_watcha          = null; // 71. 왓차별점 1.5점에 대한 평가자수
    private String rating04_watcha          = null; // 72. 왓차별점 2점에 대한 평가자수
    private String rating05_watcha          = null; // 73. 왓차별점 2.5점에 대한 평가자수
    private String rating06_watcha          = null; // 74. 왓차별점 3점에 대한 평가자수
    private String rating07_watcha          = null; // 75. 왓차별점 3.5점에 대한 평가자수
    private String rating08_watcha          = null; // 76. 왓차별점 4점에 대한 평가자수
    private String rating09_watcha          = null; // 77. 왓차별점 4.5점에 대한 평가자수
    private String rating10_watcha          = null; // 78. 왓차별점 5점에 대한 평가자수
    private String comment_cnt              = null; // 79. 왓차별점 댓글 개수
    private String cine21_id				= null; // 80. 씨네21 ID
    private String cine21_rating 			= null; // 81. 씨네 21 평균 별점
    private String cine21_count				= null; // 82. 씨네 21 리뷰수

    private String reserve_price			= null; // 83. 예약구매 가격
    private String reserve_view_date		= null; // 84. 시청가능일
    private String reserve_delay_yn			= null; // 85. 예약구매 서비스 지연
    private String nscreen_yn				= null; // 86. Nscreen 컨텐츠 여부

    private String result_type			= null;  // 영상구분
    private String event_info			    = null;  // 이벤트안내문구
    private String country			    = null;  // 국적
    private String genre_mid			    = null;  // 장르(중)
    private String genre_small			= null;  // 장르(소)
    private String summary1			    = null;  // 줄거리1
    private String summary2			    = null;  // 줄거리2
    private String is_hdr		    	    = null;
    private String horz_poster_image	= null;
    private String mainImg			    = null;  // 메인이미지 파일명
    private String logoImg			    = null;  // 타이틀 로고 이미지 파일명

    private String prev_album_id			= null;       //
    private String prev_album_name		= null;
    private String still_img             = null;        //부가영상,예고편 스틸컷
    private String vod_file_name			= null;
    private String vod_file_size			= null;
    private String cap_file_name			= null;
    private String cap_file_size			= null;

    private String tot_cnt			    = null;       //전체개수
    private String series_id		    	= null;       //시리즈id
    private String series_nm		    	= null;       //시리즈명
    private String series_info			= null;       //시리즈 대표 줄거리
    private String update_info			= null;        //시리즈 업데이트 일정
    private String still_url		    	= null;        //스틸컷 url
    private String conts_img_url			= null;        //스토리아트(백그라운드이미지).타이틀로고.신규가로포스터 이미지 url
    private String caption_url		    = null;        //예고편,부가영상 자막 url
    private String series_logo			= null;        //시리즈 로고 이미지 파일
    private String pkg_yn                 = null;        //패키지 카테고리 여부
    private ArrayList<String> season_cat_id         = null;        //시즌정보-카테고리id
    private ArrayList<String> season_cat_nm         = null;        //시즌정보 - 카테고리명
    private String focus_album_id        = null;        //포커스할 앨범 id
    private String current_page           = null;        //guswo vpdlwl qjsgh
    private String vod_server1	     	 = null;
    private String vod_server2			 = null;
    private String vod_server3			 = null;
    private String vod_server1_type		 = null;
    private String vod_server2_type		 = null;
    private String vod_server3_type		 = null;

    private String subTitle		 = null;

    private String poster_url_old			= null;  //구 포스터 이미지 URL

    protected GetI30ContList(Parcel in) {
        album_id = in.readString();
        album_name = in.readString();
        cha_num = in.readString();
        img_file_name_h = in.readString();
        img_file_name_v = in.readString();
        runtime = in.readString();
        pr_info = in.readString();
        kids_grade = in.readString();
        is_51_ch = in.readString();
        synopsis = in.readString();
        is_new = in.readString();
        is_update = in.readString();
        is_hot = in.readString();
        overseer_name = in.readString();
        actor = in.readString();
        is_caption = in.readString();
        is_hd = in.readString();
        event_type = in.readString();
        point = in.readString();
        series_no = in.readString();
        ser_disp_yn = in.readString();
        onair_date = in.readString();
        series_desc = in.readString();
        cont_type = in.readString();
        is_3d_yn = in.readString();
        event_value = in.readString();
        broadcast_yn = in.readString();
        preview_yn = in.readString();
        service_gb = in.readString();
        app_type = in.readString();
        terr_yn = in.readString();
        terr_ed_date = in.readString();
        still_file_names = in.createStringArrayList();
        urls = in.createStringArrayList();
        file_names = in.createStringArrayList();
        file_sizes = in.createStringArrayList();
        contents_ids = in.createStringArrayList();
        contents_names = in.createStringArrayList();
        last_watch_yn = in.readString();
        favorite_yn = in.readString();
        secondtv_right_yn = in.readString();
        point_count = in.readString();
        back_file_names = in.createStringArrayList();
        img_url = in.readString();
        onAirDate2 = in.readString();
        player = in.readString();
        producer = in.readString();
        directorDisplay = in.readString();
        releaseDate = in.readString();
        starringActor = in.readString();
        recommendationAge = in.readString();
        voiceActor = in.readString();
        studio = in.readString();
        albumMusic = in.readString();
        genreType = in.readString();
        is_fh = in.readString();
        is_uhd = in.readString();
        genre_large = in.readString();
        genre_info = in.readString();
        return_page_no = in.readString();
        qd_flag = in.readString();
        smi_language = in.readString();
        link_watcha = in.readString();
        cp_property = in.readString();
        preview_flag = in.readString();
        price = in.readString();
        point_watcha = in.readString();
        point_cnt_watcha = in.readString();
        rating01_watcha = in.readString();
        rating02_watcha = in.readString();
        rating03_watcha = in.readString();
        rating04_watcha = in.readString();
        rating05_watcha = in.readString();
        rating06_watcha = in.readString();
        rating07_watcha = in.readString();
        rating08_watcha = in.readString();
        rating09_watcha = in.readString();
        rating10_watcha = in.readString();
        comment_cnt = in.readString();
        cine21_id = in.readString();
        cine21_rating = in.readString();
        cine21_count = in.readString();
        reserve_price = in.readString();
        reserve_view_date = in.readString();
        reserve_delay_yn = in.readString();
        nscreen_yn = in.readString();
        result_type = in.readString();
        event_info = in.readString();
        country = in.readString();
        genre_mid = in.readString();
        genre_small = in.readString();
        summary1 = in.readString();
        summary2 = in.readString();
        is_hdr = in.readString();
        horz_poster_image = in.readString();
        mainImg = in.readString();
        logoImg = in.readString();
        prev_album_id = in.readString();
        prev_album_name = in.readString();
        still_img = in.readString();
        vod_file_name = in.readString();
        vod_file_size = in.readString();
        cap_file_name = in.readString();
        cap_file_size = in.readString();
        tot_cnt = in.readString();
        series_id = in.readString();
        series_nm = in.readString();
        series_info = in.readString();
        update_info = in.readString();
        still_url = in.readString();
        conts_img_url = in.readString();
        caption_url = in.readString();
        series_logo = in.readString();
        pkg_yn = in.readString();
        season_cat_id = in.createStringArrayList();
        season_cat_nm = in.createStringArrayList();
        focus_album_id = in.readString();
        current_page = in.readString();
        vod_server1 = in.readString();
        vod_server2 = in.readString();
        vod_server3 = in.readString();
        vod_server1_type = in.readString();
        vod_server2_type = in.readString();
        vod_server3_type = in.readString();
        subTitle = in.readString();
        poster_url_old = in.readString();
    }

    public static final Creator<GetI30ContList> CREATOR = new Creator<GetI30ContList>() {
        @Override
        public GetI30ContList createFromParcel(Parcel in) {
            return new GetI30ContList(in);
        }

        @Override
        public GetI30ContList[] newArray(int size) {
            return new GetI30ContList[size];
        }
    };

    public GetI30ContList() {

    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getCha_num() {
        return cha_num;
    }

    public void setCha_num(String cha_num) {
        this.cha_num = cha_num;
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

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getPr_info() {
        return pr_info;
    }

    public void setPr_info(String pr_info) {
        this.pr_info = pr_info;
    }

    public String getKids_grade() {
        return kids_grade;
    }

    public void setKids_grade(String kids_grade) {
        this.kids_grade = kids_grade;
    }

    public String getIs_51_ch() {
        return is_51_ch;
    }

    public void setIs_51_ch(String is_51_ch) {
        this.is_51_ch = is_51_ch;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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

    public String getOverseer_name() {
        return overseer_name;
    }

    public void setOverseer_name(String overseer_name) {
        this.overseer_name = overseer_name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
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

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getSeries_no() {
        return series_no;
    }

    public void setSeries_no(String series_no) {
        this.series_no = series_no;
    }

    public String getSer_disp_yn() {
        return ser_disp_yn;
    }

    public void setSer_disp_yn(String ser_disp_yn) {
        this.ser_disp_yn = ser_disp_yn;
    }

    public String getOnair_date() {
        return onair_date;
    }

    public void setOnair_date(String onair_date) {
        this.onair_date = onair_date;
    }

    public String getSeries_desc() {
        return series_desc;
    }

    public void setSeries_desc(String series_desc) {
        this.series_desc = series_desc;
    }

    public String getCont_type() {
        return cont_type;
    }

    public void setCont_type(String cont_type) {
        this.cont_type = cont_type;
    }

    public String getIs_3d_yn() {
        return is_3d_yn;
    }

    public void setIs_3d_yn(String is_3d_yn) {
        this.is_3d_yn = is_3d_yn;
    }

    public String getEvent_value() {
        return event_value;
    }

    public void setEvent_value(String event_value) {
        this.event_value = event_value;
    }

    public String getBroadcast_yn() {
        return broadcast_yn;
    }

    public void setBroadcast_yn(String broadcast_yn) {
        this.broadcast_yn = broadcast_yn;
    }

    public String getPreview_yn() {
        return preview_yn;
    }

    public void setPreview_yn(String preview_yn) {
        this.preview_yn = preview_yn;
    }

    public String getService_gb() {
        return service_gb;
    }

    public void setService_gb(String service_gb) {
        this.service_gb = service_gb;
    }

    public String getApp_type() {
        return app_type;
    }

    public void setApp_type(String app_type) {
        this.app_type = app_type;
    }

    public String getTerr_yn() {
        return terr_yn;
    }

    public void setTerr_yn(String terr_yn) {
        this.terr_yn = terr_yn;
    }

    public String getTerr_ed_date() {
        return terr_ed_date;
    }

    public void setTerr_ed_date(String terr_ed_date) {
        this.terr_ed_date = terr_ed_date;
    }

    public ArrayList<String> getStill_file_names() {
        return still_file_names;
    }

    public void setStill_file_names(ArrayList<String> still_file_names) {
        this.still_file_names = still_file_names;
    }

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }

    public ArrayList<String> getFile_names() {
        return file_names;
    }

    public void setFile_names(ArrayList<String> file_names) {
        this.file_names = file_names;
    }

    public ArrayList<String> getFile_sizes() {
        return file_sizes;
    }

    public void setFile_sizes(ArrayList<String> file_sizes) {
        this.file_sizes = file_sizes;
    }

    public ArrayList<String> getContents_ids() {
        return contents_ids;
    }

    public void setContents_ids(ArrayList<String> contents_ids) {
        this.contents_ids = contents_ids;
    }

    public ArrayList<String> getContents_names() {
        return contents_names;
    }

    public void setContents_names(ArrayList<String> contents_names) {
        this.contents_names = contents_names;
    }

    public String getLast_watch_yn() {
        return last_watch_yn;
    }

    public void setLast_watch_yn(String last_watch_yn) {
        this.last_watch_yn = last_watch_yn;
    }

    public String getFavorite_yn() {
        return favorite_yn;
    }

    public void setFavorite_yn(String favorite_yn) {
        this.favorite_yn = favorite_yn;
    }

    public String getSecondtv_right_yn() {
        return secondtv_right_yn;
    }

    public void setSecondtv_right_yn(String secondtv_right_yn) {
        this.secondtv_right_yn = secondtv_right_yn;
    }

    public String getPoint_count() {
        return point_count;
    }

    public void setPoint_count(String point_count) {
        this.point_count = point_count;
    }

    public ArrayList<String> getBack_file_names() {
        return back_file_names;
    }

    public void setBack_file_names(ArrayList<String> back_file_names) {
        this.back_file_names = back_file_names;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getOnAirDate2() {
        return onAirDate2;
    }

    public void setOnAirDate2(String onAirDate2) {
        this.onAirDate2 = onAirDate2;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDirectorDisplay() {
        return directorDisplay;
    }

    public void setDirectorDisplay(String directorDisplay) {
        this.directorDisplay = directorDisplay;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getStarringActor() {
        return starringActor;
    }

    public void setStarringActor(String starringActor) {
        this.starringActor = starringActor;
    }

    public String getRecommendationAge() {
        return recommendationAge;
    }

    public void setRecommendationAge(String recommendationAge) {
        this.recommendationAge = recommendationAge;
    }

    public String getVoiceActor() {
        return voiceActor;
    }

    public void setVoiceActor(String voiceActor) {
        this.voiceActor = voiceActor;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getAlbumMusic() {
        return albumMusic;
    }

    public void setAlbumMusic(String albumMusic) {
        this.albumMusic = albumMusic;
    }

    public String getGenreType() {
        return genreType;
    }

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }

    public String getIs_fh() {
        return is_fh;
    }

    public void setIs_fh(String is_fh) {
        this.is_fh = is_fh;
    }

    public String getIs_uhd() {
        return is_uhd;
    }

    public void setIs_uhd(String is_uhd) {
        this.is_uhd = is_uhd;
    }

    public String getGenre_large() {
        return genre_large;
    }

    public void setGenre_large(String genre_large) {
        this.genre_large = genre_large;
    }

    public String getGenre_info() {
        return genre_info;
    }

    public void setGenre_info(String genre_info) {
        this.genre_info = genre_info;
    }

    public String getReturn_page_no() {
        return return_page_no;
    }

    public void setReturn_page_no(String return_page_no) {
        this.return_page_no = return_page_no;
    }

    public String getQd_flag() {
        return qd_flag;
    }

    public void setQd_flag(String qd_flag) {
        this.qd_flag = qd_flag;
    }

    public String getSmi_language() {
        return smi_language;
    }

    public void setSmi_language(String smi_language) {
        this.smi_language = smi_language;
    }

    public String getLink_watcha() {
        return link_watcha;
    }

    public void setLink_watcha(String link_watcha) {
        this.link_watcha = link_watcha;
    }

    public String getCp_property() {
        return cp_property;
    }

    public void setCp_property(String cp_property) {
        this.cp_property = cp_property;
    }

    public String getPreview_flag() {
        return preview_flag;
    }

    public void setPreview_flag(String preview_flag) {
        this.preview_flag = preview_flag;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPoint_watcha() {
        return point_watcha;
    }

    public void setPoint_watcha(String point_watcha) {
        this.point_watcha = point_watcha;
    }

    public String getPoint_cnt_watcha() {
        return point_cnt_watcha;
    }

    public void setPoint_cnt_watcha(String point_cnt_watcha) {
        this.point_cnt_watcha = point_cnt_watcha;
    }

    public String getRating01_watcha() {
        return rating01_watcha;
    }

    public void setRating01_watcha(String rating01_watcha) {
        this.rating01_watcha = rating01_watcha;
    }

    public String getRating02_watcha() {
        return rating02_watcha;
    }

    public void setRating02_watcha(String rating02_watcha) {
        this.rating02_watcha = rating02_watcha;
    }

    public String getRating03_watcha() {
        return rating03_watcha;
    }

    public void setRating03_watcha(String rating03_watcha) {
        this.rating03_watcha = rating03_watcha;
    }

    public String getRating04_watcha() {
        return rating04_watcha;
    }

    public void setRating04_watcha(String rating04_watcha) {
        this.rating04_watcha = rating04_watcha;
    }

    public String getRating05_watcha() {
        return rating05_watcha;
    }

    public void setRating05_watcha(String rating05_watcha) {
        this.rating05_watcha = rating05_watcha;
    }

    public String getRating06_watcha() {
        return rating06_watcha;
    }

    public void setRating06_watcha(String rating06_watcha) {
        this.rating06_watcha = rating06_watcha;
    }

    public String getRating07_watcha() {
        return rating07_watcha;
    }

    public void setRating07_watcha(String rating07_watcha) {
        this.rating07_watcha = rating07_watcha;
    }

    public String getRating08_watcha() {
        return rating08_watcha;
    }

    public void setRating08_watcha(String rating08_watcha) {
        this.rating08_watcha = rating08_watcha;
    }

    public String getRating09_watcha() {
        return rating09_watcha;
    }

    public void setRating09_watcha(String rating09_watcha) {
        this.rating09_watcha = rating09_watcha;
    }

    public String getRating10_watcha() {
        return rating10_watcha;
    }

    public void setRating10_watcha(String rating10_watcha) {
        this.rating10_watcha = rating10_watcha;
    }

    public String getComment_cnt() {
        return comment_cnt;
    }

    public void setComment_cnt(String comment_cnt) {
        this.comment_cnt = comment_cnt;
    }

    public String getCine21_id() {
        return cine21_id;
    }

    public void setCine21_id(String cine21_id) {
        this.cine21_id = cine21_id;
    }

    public String getCine21_rating() {
        return cine21_rating;
    }

    public void setCine21_rating(String cine21_rating) {
        this.cine21_rating = cine21_rating;
    }

    public String getCine21_count() {
        return cine21_count;
    }

    public void setCine21_count(String cine21_count) {
        this.cine21_count = cine21_count;
    }

    public String getReserve_price() {
        return reserve_price;
    }

    public void setReserve_price(String reserve_price) {
        this.reserve_price = reserve_price;
    }

    public String getReserve_view_date() {
        return reserve_view_date;
    }

    public void setReserve_view_date(String reserve_view_date) {
        this.reserve_view_date = reserve_view_date;
    }

    public String getReserve_delay_yn() {
        return reserve_delay_yn;
    }

    public void setReserve_delay_yn(String reserve_delay_yn) {
        this.reserve_delay_yn = reserve_delay_yn;
    }

    public String getNscreen_yn() {
        return nscreen_yn;
    }

    public void setNscreen_yn(String nscreen_yn) {
        this.nscreen_yn = nscreen_yn;
    }

    public String getResult_type() {
        return result_type;
    }

    public void setResult_type(String result_type) {
        this.result_type = result_type;
    }

    public String getEvent_info() {
        return event_info;
    }

    public void setEvent_info(String event_info) {
        this.event_info = event_info;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre_mid() {
        return genre_mid;
    }

    public void setGenre_mid(String genre_mid) {
        this.genre_mid = genre_mid;
    }

    public String getGenre_small() {
        return genre_small;
    }

    public void setGenre_small(String genre_small) {
        this.genre_small = genre_small;
    }

    public String getSummary1() {
        return summary1;
    }

    public void setSummary1(String summary1) {
        this.summary1 = summary1;
    }

    public String getSummary2() {
        return summary2;
    }

    public void setSummary2(String summary2) {
        this.summary2 = summary2;
    }

    public String getIs_hdr() {
        return is_hdr;
    }

    public void setIs_hdr(String is_hdr) {
        this.is_hdr = is_hdr;
    }

    public String getHorz_poster_image() {
        return horz_poster_image;
    }

    public void setHorz_poster_image(String horz_poster_image) {
        this.horz_poster_image = horz_poster_image;
    }

    public String getMainImg() {
        return mainImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public String getPrev_album_id() {
        return prev_album_id;
    }

    public void setPrev_album_id(String prev_album_id) {
        this.prev_album_id = prev_album_id;
    }

    public String getPrev_album_name() {
        return prev_album_name;
    }

    public void setPrev_album_name(String prev_album_name) {
        this.prev_album_name = prev_album_name;
    }

    public String getStill_img() {
        return still_img;
    }

    public void setStill_img(String still_img) {
        this.still_img = still_img;
    }

    public String getVod_file_name() {
        return vod_file_name;
    }

    public void setVod_file_name(String vod_file_name) {
        this.vod_file_name = vod_file_name;
    }

    public String getVod_file_size() {
        return vod_file_size;
    }

    public void setVod_file_size(String vod_file_size) {
        this.vod_file_size = vod_file_size;
    }

    public String getCap_file_name() {
        return cap_file_name;
    }

    public void setCap_file_name(String cap_file_name) {
        this.cap_file_name = cap_file_name;
    }

    public String getCap_file_size() {
        return cap_file_size;
    }

    public void setCap_file_size(String cap_file_size) {
        this.cap_file_size = cap_file_size;
    }

    public String getTot_cnt() {
        return tot_cnt;
    }

    public void setTot_cnt(String tot_cnt) {
        this.tot_cnt = tot_cnt;
    }

    public String getSeries_id() {
        return series_id;
    }

    public void setSeries_id(String series_id) {
        this.series_id = series_id;
    }

    public String getSeries_nm() {
        return series_nm;
    }

    public void setSeries_nm(String series_nm) {
        this.series_nm = series_nm;
    }

    public String getSeries_info() {
        return series_info;
    }

    public void setSeries_info(String series_info) {
        this.series_info = series_info;
    }

    public String getUpdate_info() {
        return update_info;
    }

    public void setUpdate_info(String update_info) {
        this.update_info = update_info;
    }

    public String getStill_url() {
        return still_url;
    }

    public void setStill_url(String still_url) {
        this.still_url = still_url;
    }

    public String getConts_img_url() {
        return conts_img_url;
    }

    public void setConts_img_url(String conts_img_url) {
        this.conts_img_url = conts_img_url;
    }

    public String getCaption_url() {
        return caption_url;
    }

    public void setCaption_url(String caption_url) {
        this.caption_url = caption_url;
    }

    public String getSeries_logo() {
        return series_logo;
    }

    public void setSeries_logo(String series_logo) {
        this.series_logo = series_logo;
    }

    public String getPkg_yn() {
        return pkg_yn;
    }

    public void setPkg_yn(String pkg_yn) {
        this.pkg_yn = pkg_yn;
    }

    public ArrayList<String> getSeason_cat_id() {
        return season_cat_id;
    }

    public void setSeason_cat_id(ArrayList<String> season_cat_id) {
        this.season_cat_id = season_cat_id;
    }

    public ArrayList<String> getSeason_cat_nm() {
        return season_cat_nm;
    }

    public void setSeason_cat_nm(ArrayList<String> season_cat_nm) {
        this.season_cat_nm = season_cat_nm;
    }

    public String getFocus_album_id() {
        return focus_album_id;
    }

    public void setFocus_album_id(String focus_album_id) {
        this.focus_album_id = focus_album_id;
    }

    public String getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(String current_page) {
        this.current_page = current_page;
    }

    public String getVod_server1() {
        return vod_server1;
    }

    public void setVod_server1(String vod_server1) {
        this.vod_server1 = vod_server1;
    }

    public String getVod_server2() {
        return vod_server2;
    }

    public void setVod_server2(String vod_server2) {
        this.vod_server2 = vod_server2;
    }

    public String getVod_server3() {
        return vod_server3;
    }

    public void setVod_server3(String vod_server3) {
        this.vod_server3 = vod_server3;
    }

    public String getVod_server1_type() {
        return vod_server1_type;
    }

    public void setVod_server1_type(String vod_server1_type) {
        this.vod_server1_type = vod_server1_type;
    }

    public String getVod_server2_type() {
        return vod_server2_type;
    }

    public void setVod_server2_type(String vod_server2_type) {
        this.vod_server2_type = vod_server2_type;
    }

    public String getVod_server3_type() {
        return vod_server3_type;
    }

    public void setVod_server3_type(String vod_server3_type) {
        this.vod_server3_type = vod_server3_type;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getPoster_url_old() {
        return poster_url_old;
    }

    public void setPoster_url_old(String poster_url_old) {
        this.poster_url_old = poster_url_old;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(album_id);
        dest.writeString(album_name);
        dest.writeString(cha_num);
        dest.writeString(img_file_name_h);
        dest.writeString(img_file_name_v);
        dest.writeString(runtime);
        dest.writeString(pr_info);
        dest.writeString(kids_grade);
        dest.writeString(is_51_ch);
        dest.writeString(synopsis);
        dest.writeString(is_new);
        dest.writeString(is_update);
        dest.writeString(is_hot);
        dest.writeString(overseer_name);
        dest.writeString(actor);
        dest.writeString(is_caption);
        dest.writeString(is_hd);
        dest.writeString(event_type);
        dest.writeString(point);
        dest.writeString(series_no);
        dest.writeString(ser_disp_yn);
        dest.writeString(onair_date);
        dest.writeString(series_desc);
        dest.writeString(cont_type);
        dest.writeString(is_3d_yn);
        dest.writeString(event_value);
        dest.writeString(broadcast_yn);
        dest.writeString(preview_yn);
        dest.writeString(service_gb);
        dest.writeString(app_type);
        dest.writeString(terr_yn);
        dest.writeString(terr_ed_date);
        dest.writeStringList(still_file_names);
        dest.writeStringList(urls);
        dest.writeStringList(file_names);
        dest.writeStringList(file_sizes);
        dest.writeStringList(contents_ids);
        dest.writeStringList(contents_names);
        dest.writeString(last_watch_yn);
        dest.writeString(favorite_yn);
        dest.writeString(secondtv_right_yn);
        dest.writeString(point_count);
        dest.writeStringList(back_file_names);
        dest.writeString(img_url);
        dest.writeString(onAirDate2);
        dest.writeString(player);
        dest.writeString(producer);
        dest.writeString(directorDisplay);
        dest.writeString(releaseDate);
        dest.writeString(starringActor);
        dest.writeString(recommendationAge);
        dest.writeString(voiceActor);
        dest.writeString(studio);
        dest.writeString(albumMusic);
        dest.writeString(genreType);
        dest.writeString(is_fh);
        dest.writeString(is_uhd);
        dest.writeString(genre_large);
        dest.writeString(genre_info);
        dest.writeString(return_page_no);
        dest.writeString(qd_flag);
        dest.writeString(smi_language);
        dest.writeString(link_watcha);
        dest.writeString(cp_property);
        dest.writeString(preview_flag);
        dest.writeString(price);
        dest.writeString(point_watcha);
        dest.writeString(point_cnt_watcha);
        dest.writeString(rating01_watcha);
        dest.writeString(rating02_watcha);
        dest.writeString(rating03_watcha);
        dest.writeString(rating04_watcha);
        dest.writeString(rating05_watcha);
        dest.writeString(rating06_watcha);
        dest.writeString(rating07_watcha);
        dest.writeString(rating08_watcha);
        dest.writeString(rating09_watcha);
        dest.writeString(rating10_watcha);
        dest.writeString(comment_cnt);
        dest.writeString(cine21_id);
        dest.writeString(cine21_rating);
        dest.writeString(cine21_count);
        dest.writeString(reserve_price);
        dest.writeString(reserve_view_date);
        dest.writeString(reserve_delay_yn);
        dest.writeString(nscreen_yn);
        dest.writeString(result_type);
        dest.writeString(event_info);
        dest.writeString(country);
        dest.writeString(genre_mid);
        dest.writeString(genre_small);
        dest.writeString(summary1);
        dest.writeString(summary2);
        dest.writeString(is_hdr);
        dest.writeString(horz_poster_image);
        dest.writeString(mainImg);
        dest.writeString(logoImg);
        dest.writeString(prev_album_id);
        dest.writeString(prev_album_name);
        dest.writeString(still_img);
        dest.writeString(vod_file_name);
        dest.writeString(vod_file_size);
        dest.writeString(cap_file_name);
        dest.writeString(cap_file_size);
        dest.writeString(tot_cnt);
        dest.writeString(series_id);
        dest.writeString(series_nm);
        dest.writeString(series_info);
        dest.writeString(update_info);
        dest.writeString(still_url);
        dest.writeString(conts_img_url);
        dest.writeString(caption_url);
        dest.writeString(series_logo);
        dest.writeString(pkg_yn);
        dest.writeStringList(season_cat_id);
        dest.writeStringList(season_cat_nm);
        dest.writeString(focus_album_id);
        dest.writeString(current_page);
        dest.writeString(vod_server1);
        dest.writeString(vod_server2);
        dest.writeString(vod_server3);
        dest.writeString(vod_server1_type);
        dest.writeString(vod_server2_type);
        dest.writeString(vod_server3_type);
        dest.writeString(subTitle);
        dest.writeString(poster_url_old);
    }
}
