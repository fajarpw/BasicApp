package org.aplas.basicapp

class Temperature {
    var celcius = 0.0

    var fahrenheit: Double
        get() = celcius * 9 / 5 + 32
        //Convert fahrenheit to celcius
        set(celcius){
            this.celcius = (celcius-32) / 9 * 5
        }

    var kelvins: Double
        get() = celcius + 273.15
        //Convert kelvin to celcius
        set(celcius){
            this.celcius = celcius - 273.15
        }

    fun convert(oriUnit: String, convUnit: String, value: Double):
            Double{
        if(oriUnit == "°C"){
            celcius = value
        }else if(oriUnit == "°F"){
            fahrenheit = value
        }else{
            kelvins = value
        }
        return if (convUnit=="°C"){
            celcius
        }else if(convUnit=="°F"){
            fahrenheit
        }else{
            kelvins
        }
    }
}