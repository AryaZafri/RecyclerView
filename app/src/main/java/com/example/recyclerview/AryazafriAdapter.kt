    package com.example.recyclerview

    import android.content.Context
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView

    class AryazafriAdapter(private val context: Context, private val aryaZafri: List<AryaZafri>, val listener: (AryaZafri) -> Unit)
        : RecyclerView.Adapter<AryazafriAdapter.AryazafriViewHolder>(){

         class AryazafriViewHolder(view: View): RecyclerView.ViewHolder(view){

             val imgAryaZafri = view.findViewById<ImageView>(R.id.img_item_photo)
             val nameAryaZafri = view.findViewById<TextView>(R.id.tv_item_name)
             val descAryaZafri = view.findViewById<TextView>(R.id.tv_item_description)

             fun  bindView(aryaZafri: AryaZafri, listener: (AryaZafri) -> Unit){
                 imgAryaZafri.setImageResource(aryaZafri.imgAryaZafri)
                 nameAryaZafri.text = aryaZafri.nameAryaZafri
                 descAryaZafri.text = aryaZafri.descAryaZafri
                 itemView.setOnClickListener{
                     listener(aryaZafri)
                 }
             }
         }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AryazafriViewHolder {
            return AryazafriViewHolder(
                LayoutInflater.from(context).inflate(R.layout.item_aryazafri, parent, false)
            )
        }

        override fun onBindViewHolder(holder: AryazafriViewHolder, position: Int) {
            holder.bindView(aryaZafri[position], listener)
        }

        override fun getItemCount(): Int = aryaZafri.size

        }
