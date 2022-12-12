package dgtic.unam.dogapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dgtic.unam.dogapi.databinding.ItemDogBinding

class DogAdapter(val images:List<String>): RecyclerView.Adapter<DogAdapter.DogViewHolder>(){

    class DogViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemDogBinding.bind(view)
        fun bind(image: String) {
            Picasso.get().load(image).into(binding.imgView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog,parent,false))
    }
    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item:String=images[position]
        holder.bind(item)
    }
    override fun getItemCount(): Int {
        return images.size
    }
}