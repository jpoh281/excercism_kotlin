object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {


        if(leftStrand.length != rightStrand.length){
            throw IllegalArgumentException("left and right strands must be of equal length")
        }


        var distance = 0

        for (i:Int in 0 until  leftStrand.count()) {
            if(leftStrand[i] != rightStrand[i]){
                distance++
            }
        }

        return distance
    }
}
