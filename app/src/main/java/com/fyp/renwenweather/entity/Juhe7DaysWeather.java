package com.fyp.renwenweather.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fyp on 2015/12/29.
 */
public class Juhe7DaysWeather implements Serializable{
    /**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"2","wind_direction":"北风","wind_strength":"2级","humidity":"21%","time":"16:05"},"today":{"temperature":"-6℃~2℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风3-4 级","week":"星期一","city":"北京","date_y":"2016年01月04日","dressing_index":"冷","dressing_advice":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。","uv_index":"最弱","comfort_index":"","wash_index":"较适宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""},"future":[{"temperature":"-6℃~2℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风3-4 级","week":"星期一","date":"20160104"},{"temperature":"-6℃~1℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-4 级","week":"星期二","date":"20160105"},{"temperature":"-7℃~3℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-4 级","week":"星期三","date":"20160106"},{"temperature":"-7℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"微风","week":"星期四","date":"20160107"},{"temperature":"-8℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-4 级","week":"星期五","date":"20160108"},{"temperature":"-7℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"微风","week":"星期六","date":"20160109"},{"temperature":"-7℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"微风","week":"星期日","date":"20160110"}]}
     */

    private String resultcode;
    private String reason;
    /**
     * sk : {"temp":"2","wind_direction":"北风","wind_strength":"2级","humidity":"21%","time":"16:05"}
     * today : {"temperature":"-6℃~2℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风3-4 级","week":"星期一","city":"北京","date_y":"2016年01月04日","dressing_index":"冷","dressing_advice":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。","uv_index":"最弱","comfort_index":"","wash_index":"较适宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""}
     * future : [{"temperature":"-6℃~2℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风3-4 级","week":"星期一","date":"20160104"},{"temperature":"-6℃~1℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-4 级","week":"星期二","date":"20160105"},{"temperature":"-7℃~3℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-4 级","week":"星期三","date":"20160106"},{"temperature":"-7℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"微风","week":"星期四","date":"20160107"},{"temperature":"-8℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-4 级","week":"星期五","date":"20160108"},{"temperature":"-7℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"微风","week":"星期六","date":"20160109"},{"temperature":"-7℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"微风","week":"星期日","date":"20160110"}]
     */

    private ResultEntity result;

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public String getResultcode() {
        return resultcode;
    }

    public String getReason() {
        return reason;
    }

    public ResultEntity getResult() {
        return result;
    }

    public static class ResultEntity implements Serializable {
        /**
         * temp : 2
         * wind_direction : 北风
         * wind_strength : 2级
         * humidity : 21%
         * time : 16:05
         */

        private SkEntity sk;
        /**
         * temperature : -6℃~2℃
         * weather : 多云转晴
         * weather_id : {"fa":"01","fb":"00"}
         * wind : 北风3-4 级
         * week : 星期一
         * city : 北京
         * date_y : 2016年01月04日
         * dressing_index : 冷
         * dressing_advice : 天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。
         * uv_index : 最弱
         * comfort_index :
         * wash_index : 较适宜
         * travel_index : 较不宜
         * exercise_index : 较不宜
         * drying_index :
         */

        private TodayEntity today;
        /**
         * temperature : -6℃~2℃
         * weather : 多云转晴
         * weather_id : {"fa":"01","fb":"00"}
         * wind : 北风3-4 级
         * week : 星期一
         * date : 20160104
         */

        private List<FutureEntity> future;

        public void setSk(SkEntity sk) {
            this.sk = sk;
        }

        public void setToday(TodayEntity today) {
            this.today = today;
        }

        public void setFuture(List<FutureEntity> future) {
            this.future = future;
        }

        public SkEntity getSk() {
            return sk;
        }

        public TodayEntity getToday() {
            return today;
        }

        public List<FutureEntity> getFuture() {
            return future;
        }

        public static class SkEntity implements Serializable {
            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTemp() {
                return temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public String getTime() {
                return time;
            }
        }

        public static class TodayEntity implements Serializable {
            private String temperature;
            private String weather;
            /**
             * fa : 01
             * fb : 00
             */

            private WeatherIdEntity weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public void setWeather_id(WeatherIdEntity weather_id) {
                this.weather_id = weather_id;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public String getTemperature() {
                return temperature;
            }

            public String getWeather() {
                return weather;
            }

            public WeatherIdEntity getWeather_id() {
                return weather_id;
            }

            public String getWind() {
                return wind;
            }

            public String getWeek() {
                return week;
            }

            public String getCity() {
                return city;
            }

            public String getDate_y() {
                return date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public static class WeatherIdEntity implements Serializable {
                private String fa;
                private String fb;

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }

                public String getFa() {
                    return fa;
                }

                public String getFb() {
                    return fb;
                }
            }
        }

        public static class FutureEntity implements Serializable {
            private String temperature;
            private String weather;
            /**
             * fa : 01
             * fb : 00
             */

            private WeatherIdEntity weather_id;
            private String wind;
            private String week;
            private String date;

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public void setWeather_id(WeatherIdEntity weather_id) {
                this.weather_id = weather_id;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTemperature() {
                return temperature;
            }

            public String getWeather() {
                return weather;
            }

            public WeatherIdEntity getWeather_id() {
                return weather_id;
            }

            public String getWind() {
                return wind;
            }

            public String getWeek() {
                return week;
            }

            public String getDate() {
                return date;
            }

            public static class WeatherIdEntity implements Serializable {
                private String fa;
                private String fb;

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }

                public String getFa() {
                    return fa;
                }

                public String getFb() {
                    return fb;
                }
            }
        }
    }
}
