package org.aplas.basicapp

class Weight {
    var gram = 0.0

    var ounce: Double
    get() = gram / 28.3495231
    //Convert ounce to gram
    set(gram){
        this.gram = gram * 28.3495231
    }

    var pound: Double
    get() = gram / 453.59237
    //Convert pound to gram
    set(gram) {
        this.gram = gram * 453.59237
    }

    fun convert(oriUnit: String, convUnit: String, value:Double):
            Double{
        if(oriUnit == "Grm"){
            gram = value
        }else if(oriUnit == "Onc"){
            ounce = value
        }else{
            pound = value
        }
        return if(convUnit== "Grm"){
            gram
        }else if(convUnit == "Onc"){
            ounce
        }else{
            pound
        }
    }
}