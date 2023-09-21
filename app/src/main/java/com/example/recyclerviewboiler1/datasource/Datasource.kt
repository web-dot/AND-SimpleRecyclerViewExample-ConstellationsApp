package com.example.recyclerviewboiler1.datasource

import com.example.recyclerviewboiler1.R
import com.example.recyclerviewboiler1.model.Constellation

class Datasource {
    fun loadConstellations(): List<Constellation>{
        return listOf<Constellation>(
            Constellation(R.string.constellation1),
            Constellation(R.string.constellation2),
            Constellation(R.string.constellation3),
            Constellation(R.string.constellation4),
            Constellation(R.string.constellation5)
        )
    }
}