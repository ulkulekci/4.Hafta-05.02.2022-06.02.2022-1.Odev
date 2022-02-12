package com.innova.liskov_substitution_princeple;

public class AudioBookDelivery extends BookDelivery {

    @Override
    void getDeliveryLocations() {

        /* GetDeliveryLocations() yönteminin bazı özelliklerini değiştirebiliriz,
        ancak bu Liskov'un Yer Değiştirme İlkesini ihlal eder.
        Değişiklikten sonra, uygulamayı bozmadan BookDelivery üst sınıfını
        AudioBookDelivery alt sınıfıyla değiştiremedik.
        can't be implemented since

         * Audio book doesn't have

         * a physical location. */

    }


}