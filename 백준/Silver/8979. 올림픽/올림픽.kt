fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val countries = ArrayList<Country>()
    val ans = ArrayList<Pair<Int, Int>>()
    for (i in 0 until n) {
        val list = readLine().split(' ').map { it.toInt() }
        countries.add(Country(list[0], list[1], list[2], list[3]))
    }
    val sortedCountries = countries.sortedWith(compareBy({ it.gold }, { it.silver }, { it.bronze }))
    ans.add(Pair(0, sortedCountries[0].idx))
    for (i in 1 until countries.size) {
        if (sortedCountries[i - 1].gold == sortedCountries[i].gold && sortedCountries[i - 1].silver == sortedCountries[i].silver &&
            sortedCountries[i - 1].bronze == sortedCountries[i].bronze
        ) {
            ans.add(Pair(i - 1, sortedCountries[i].idx))
        } else ans.add(Pair(i, sortedCountries[i].idx))
    }
    for (i in 0 until n) {
        if (ans[i].second == k) {
            print(ans[i].first + 1)
            return@with
        }
    }
}

data class Country(val idx: Int, val gold: Int, val silver: Int, val bronze: Int)