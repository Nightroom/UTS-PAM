package lat.pam.aplikasi_makanan.data

import androidx.annotation.DrawableRes
import lat.pam.aplikasi_makanan.R

data class Food(
    val id: Int,
    val name: String,
    val description: String,
    @DrawableRes val imageRes: Int
)

val foodList = listOf(
    Food(0, "Nasi Goreng", "Nasi goreng spesial dengan telur dan ayam.", R.drawable.nasi_goreng),
    Food(1, "Sate Ayam", "Sate ayam dengan bumbu kacang yang lezat.", R.drawable.sate_ayam),
    Food(2, "Rendang", "Daging sapi yang dimasak dengan bumbu rempah khas.", R.drawable.rendang),
    Food(3, "Gado-gado", "Salad sayuran dengan saus kacang.", R.drawable.gado_gado),
    Food(4, "Soto Ayam", "Sup ayam bening dengan suwiran ayam dan tauge.", R.drawable.soto_ayam),
    Food(5, "Bakso", "Bola daging disajikan dengan mie dan kuah kaldu.", R.drawable.bakso),
    Food(6, "Mie Ayam", "Mie dengan topping ayam dan sayuran.", R.drawable.mie_ayam),
    Food(7, "Ikan Bakar", "Ikan segar yang dibakar dengan bumbu khas.", R.drawable.ikan_bakar),
    Food(8, "Ayam Goreng", "Ayam goreng renyah dengan bumbu tradisional.", R.drawable.ayam_goreng),
    Food(9, "Capcay", "Tumis berbagai macam sayuran dengan saus.", R.drawable.capcay),
    Food(10, "Martabak Telur", "Martabak gurih dengan isian telur dan daging.", R.drawable.martabak_telur),
    Food(11, "Pempek", "Kue ikan dari Palembang dengan saus cuka.", R.drawable.pempek),
    Food(12, "Rawon", "Sup daging berkuah hitam dari kluwek.", R.drawable.rawon),
    Food(13, "Pecel Lele", "Ikan lele goreng dengan sambal dan lalapan.", R.drawable.pecel_lele),
    Food(14, "Opor Ayam", "Ayam yang dimasak dengan santan dan bumbu kuning.", R.drawable.opor_ayam)
)