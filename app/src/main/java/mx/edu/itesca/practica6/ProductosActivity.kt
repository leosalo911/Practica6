package mx.edu.itesca.practica6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProductosActivity : AppCompatActivity() {

    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        agregarProductos()
    }

    fun agregarProductos(){
        menu.add(Product("Quesadillas",R.drawable.quesadillas,"Rellenas con su carne favorita, servidas con ensalada - Filled with your choice of meat, served with salad", 5.69))
        menu.add(Product("Huaraches",R.drawable.huaraches,"Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.", 10.99))
        menu.add(Product("Gringas",R.drawable.gringas,"Tortilla de harina con queso, carne al pastor y piña - Flour tortilla filled with cheese, marinated pork and pineapple.", 7.99))
        menu.add(Product("Sincronizadas",R.drawable.sincronizadas,"Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole - Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", 7.99))
        menu.add(Product("Sopes",R.drawable.sopes,"Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.", 3.79))
        menu.add(Product("Tostadas",R.drawable.tostadas,"Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate - Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.", 4.59))
    }
}