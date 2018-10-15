package io.github.sentenza.hacktoberfest18.sort

/*
 * HacktoberFest 2018 - Scala Algorhitms
 * Copyright (C) 2018 sentenza
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

object CommonSortings {
  trait CommonSorting {
    def bubbleSort(array: Array[Int]): Array[Int]
    def selectionSort(array: Array[Int]): Array[Int]
    def insertionSort(array: Array[Int]): Array[Int]
    def quickSort(array: Array[Int]): Array[Int]
    def mergeSort(array: Array[Int]): Array[Int]
  }

  object CommonSorting {
    def bubbleSort(array: Array[Int]): Array[Int] = {
      var swapped = false

      do{
        swapped = false;

        for(i <- 0 to array.length - 2){
          if(array(i) > array(i + 1)){
            val tmp = array(i)
            array(i) = array(i + 1)
            array(i + 1) = tmp
            swapped = true
          }
        }
      }
      while(swapped)
    }
    //def selectionSort(array: Array[Int]): Array[Int] = ???
    //def insertionSort(array: Array[Int]): Array[Int] = ???
    //def quickSort(array: Array[Int]): Array[Int] = ???
    def mergeSort(array: Array[Int]): Array[Int] = {
      if(array.length <= 1) array
      else{
          val piv = array(array.length / 2)
          Array.concat(
            mergeSort(array filter (piv >)),
            array filter (piv ==),
            mergeSort(array filter (piv <))
          )
      }
    }
  }
}

