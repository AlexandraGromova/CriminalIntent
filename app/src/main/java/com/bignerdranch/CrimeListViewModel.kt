package com.bignerdranch


import androidx.lifecycle.ViewModel
import com.bignerdranch.android.criminalintent.Crime
import com.bignerdranch.android.criminalintent.CrimeRepository

class CrimeListViewModel : ViewModel() {
private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrime()
}