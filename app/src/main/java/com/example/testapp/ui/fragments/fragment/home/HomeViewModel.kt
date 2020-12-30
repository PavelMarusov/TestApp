package com.example.testapp.ui.fragments.fragment.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testapp.ui.model.PostModel

class HomeViewModel : ViewModel() {
    private val list: MutableList<PostModel> = mutableListOf()

    fun getBook(): MutableList<PostModel>? {
        list.add(PostModel("Продам елку",200,"KGS","Иссык-Кульская обл.","https://yandex.ru/images/search?pos=3&img_url=https%3A%2F%2Fstatic5.depositphotos.com%2F1003390%2F411%2Fv%2F950%2Fdepositphotos_4115827-stock-illustration-christmas-tree.jpg&isize=medium&text=%D0%B5%D0%BB%D0%BA%D0%B0&rpt=simage"))
        list.add(PostModel("Срочно продам квартиру", 50000, "USD", "г.Бишкек","https://yandex.ru/images/search?pos=9&img_url=https%3A%2F%2Fpoliteka.net%2Fimages%2F2018%2F01%2F14%2FF7Pnyo6pHlYe37JgQqjfP7NswceIqP6j.jpg&isize=small&text=%D0%BA%D0%B2%D0%B0%D1%80%D1%82%D0%B8%D1%80%D0%B0&rpt=simage"))
        list.add(PostModel("Продаю копьютер",8000,"KGS","г.Ош","https://yandex.ru/images/search?pos=3&img_url=https%3A%2F%2Fsun9-30.userapi.com%2Fc857636%2Fv857636053%2F17eadf%2Fv3vKoWNofkY.jpg&isize=small&text=%D0%BA%D0%BE%D0%BC%D0%BF%D1%8C%D1%8E%D1%82%D0%B5%D1%80&rpt=simage"))
        list.add(PostModel("Продается собака",800,"KGS","с.Сокулук","https://yandex.ru/images/search?pos=1&img_url=https%3A%2F%2Fsun1-18.userapi.com%2FJ3-hewdcIoYfC6SMv9HFuq32Z8IjuodE-QvfRA%2FZIOgqYW4orY.jpg&isize=small&text=%D0%B7%D0%BB%D0%B0%D1%8F+%D1%81%D0%BE%D0%B1%D0%B0%D0%BA%D0%B0&rpt=simage"))
        list.add(PostModel("Козу сатылат",5000,"KGS","Джалал-Абадская обл","https://yandex.ru/images/search?pos=7&img_url=https%3A%2F%2Fsun9-31.userapi.com%2Fc849536%2Fv849536038%2F9c44f%2F7TK63lTXxWQ.jpg&isize=small&text=%D0%B1%D0%B0%D1%80%D0%B0%D0%BD&rpt=simage"))
        list.add(PostModel("Продам машину MB 250E",2500,"USD","Нарын","https://yandex.ru/images/search?pos=26&img_url=https%3A%2F%2Fsun9-36.userapi.com%2FAdfj-HDx4wyN578XJ36SUsVDAeP8ASaGV6uGRg%2FNf2e_ED80Mw.jpg&isize=small&text=mb+250+e&rpt=simage"))
        list.add(PostModel("Продаю яблоки",80,"KGS","г.Чолпон-Ата","https://yandex.ru/images/search?pos=3&img_url=https%3A%2F%2Frusunion.com%2Fimg%2Fnews%2F2018%2F08%2F10%2Fspecialisty-rasskazali-o-pravilnom-vybore-yablok-blog.jpg&isize=small&text=%D1%8F%D0%B1%D0%BB%D0%BE%D0%BA%D0%B8&rpt=simage"))
        list.add(PostModel("Продаю элитные сорта чая",800,"KGS","г.Сулюкта","https://yandex.ru/images/search?pos=1&img_url=https%3A%2F%2Felenatrifonova.ru%2Fbackend%2Fuploads%2Fkakoy-chay%2Fkakoy-chay.jpg&isize=small&text=%D1%87%D0%B0%D0%B9&rpt=simage"))
        list.add(PostModel("Продаю велосипед",300,"USD","г.Баткен","https://yandex.ru/images/search?pos=15&img_url=https%3A%2F%2Fwww.bicitech.it%2Ffiles%2F2019%2F08%2FFuelEX9829_19_23603_B_Portrait.jpg&isize=small&text=%D0%B2%D0%B5%D0%BB%D0%BE%D1%81%D0%B8%D0%BF%D0%B5%D0%B4&rpt=simage"))
        list.add(PostModel("Продам кроликов",800,"KGS","с.Чон-Урюкты","https://yandex.ru/images/search?pos=2&img_url=https%3A%2F%2Fpbs.twimg.com%2Fmedia%2FCp7bqwTWcAE6CoZ.jpg&isize=small&text=%D0%BA%D1%80%D0%BE%D0%BB%D0%B8%D0%BA%D0%B8&rpt=simage"))
        return list
    }
}