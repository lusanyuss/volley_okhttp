package com.yuliu.volley_okhttp;

import java.util.List;

/**
 * Created by uhouzz_android on 2016/1/28.
 */
public class JsonModel {


    /**
     * code : 0
     * message : 成功
     * data : {"city":[{"rid":"7","chinesecountry":"英国","englishcountry":"UK","cid":"4","logo":"http://pic.uhouzz.com/thumb/20151215/d78ec4e666df5132de3ab5b65609724b.jpg","chinesecity":"大伦敦","englishcity":"Greater London"},{"rid":"106","chinesecountry":"加拿大","englishcountry":"CA","cid":"93","logo":"http://pic.uhouzz.com/thumb/20151215/29a9bb00db24352eee8d453781e89334.jpg","chinesecity":"温哥华","englishcity":"Vancouver"},{"rid":"62","chinesecountry":"美国","englishcountry":"US","cid":"49","logo":"http://pic.uhouzz.com/thumb/20151215/ae1e60856b978dd7d2d4f3b57eca6242.jpg","chinesecity":"纽约","englishcity":"New York"},{"rid":"135","chinesecountry":"澳大利亚","englishcountry":"AU","cid":"133","logo":"http://pic.uhouzz.com/thumb/20151215/49a2d103f6d2c81c09343dd1c303e85f.jpg","chinesecity":"悉尼","englishcity":"Sydney"},{"rid":"121","chinesecountry":"新西兰","englishcountry":"NZ","cid":"120","logo":"http://pic.uhouzz.com/thumb/20151215/0863fe278dc85f675a9600e4cc5fc866.jpg","chinesecity":"奥克兰","englishcity":"Auckland"}],"school":[{"id":"179","chinesename":"纽约大学","chinesecountry":"美国","englishcountry":"United States","englishname":"New York University（NYU）","chinesecity":"纽约","englishcity":"New York","rid":"62","imgjson":"http://pic.uhouzz.com/schoolImgList/20151020/40cbe1081b73486a17394ef61f803483.jpg","countryid":"49"},{"id":"39","chinesename":"曼彻斯特大学","chinesecountry":"英国","englishcountry":"United Kingdom","englishname":"University of Manchester","chinesecity":"大曼彻斯特","englishcity":"Greater Manchester","rid":"10","imgjson":"http://pic.uhouzz.com/thumb/20151023/89d777e0d215d9dadfee08ef4585cd37.jpg","countryid":"4"},{"id":"401","chinesename":"悉尼大学","chinesecountry":"澳洲","englishcountry":"Australia","englishname":"The University of Sydney","chinesecity":"悉尼","englishcity":"Sydney","rid":"135","imgjson":"http://pic.uhouzz.com/thumb/20151208/6be5112cdca392e5768736cbd47b43cc.jpg","countryid":"133"},{"id":"307","chinesename":"不列颠哥伦比亚大学","chinesecountry":"加拿大","englishcountry":"Canada","englishname":"University of British Columbia(UBC)","chinesecity":"温哥华","englishcity":"Vancouver","rid":"106","imgjson":"http://pic.uhouzz.com/thumb/20151208/b79dba0d2a9236b020eabda37512d8f0.jpg","countryid":"93"},{"id":"360","chinesename":"奥克兰大学","chinesecountry":"新西兰","englishcountry":"New Zealand","englishname":"University of Auckland","chinesecity":"奥克兰","englishcity":"Auckland","rid":"121","imgjson":"http://pic.uhouzz.com/schoolImgList/20151020/caeedefb4977a69d8c73eb3913797c7e.jpg","countryid":"120"}]}
     */

    public int code;
    public String message;
    public DataEntity data;

    public static class DataEntity {
        /**
         * rid : 7
         * chinesecountry : 英国
         * englishcountry : UK
         * cid : 4
         * logo : http://pic.uhouzz.com/thumb/20151215/d78ec4e666df5132de3ab5b65609724b.jpg
         * chinesecity : 大伦敦
         * englishcity : Greater London
         */

        public List<CityEntity> city;
        /**
         * id : 179
         * chinesename : 纽约大学
         * chinesecountry : 美国
         * englishcountry : United States
         * englishname : New York University（NYU）
         * chinesecity : 纽约
         * englishcity : New York
         * rid : 62
         * imgjson : http://pic.uhouzz.com/schoolImgList/20151020/40cbe1081b73486a17394ef61f803483.jpg
         * countryid : 49
         */

        public List<SchoolEntity> school;

        public static class CityEntity {
            public String rid;
            public String chinesecountry;
            public String englishcountry;
            public String cid;
            public String logo;
            public String chinesecity;
            public String englishcity;
        }

        public static class SchoolEntity {
            public String id;
            public String chinesename;
            public String chinesecountry;
            public String englishcountry;
            public String englishname;
            public String chinesecity;
            public String englishcity;
            public String rid;
            public String imgjson;
            public String countryid;
        }
    }
}
