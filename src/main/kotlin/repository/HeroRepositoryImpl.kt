package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero
import kotlin.collections.emptyList

class HeroRepositoryImpl : HeroRepository {

    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1: List<Hero> = listOf(
        Hero(
            id = 1,
            name = "Hulk",
            image = "/images/hulk.jpg",
            about = "緑色の化物だがヒーロー",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf(
                "John",
                "sera"
            ),
            abilities = listOf(
                "ハンマーカンまー",
                "右手がハンマー",
                "左手がカンマー"
            ),
            natureTypes = emptyList(),
        ),
        Hero(
            id = 2,
            name = "Iron Man",
            image = "/images/ironman.jpg",
            about = "天才発明家でありアーマードヒーロー",
            rating = 4.8,
            power = 92,
            month = "May",
            day = "29th",
            family = listOf(
                "Howard",
                "Pepper"
            ),
            abilities = listOf(
                "リパルサーレイ",
                "ユニビーム",
                "フライト"
            ),
            natureTypes = emptyList(),
        ),
        Hero(
            id = 3,
            name = "Thor",
            image = "/images/thor.jpg",
            about = "アスガルドの雷神",
            rating = 4.9,
            power = 97,
            month = "November",
            day = "3rd",
            family = listOf(
                "Odin",
                "Loki"
            ),
            abilities = listOf(
                "ムジョルニア",
                "雷撃",
                "召喚"
            ),
            natureTypes = listOf("Lightning"),
        )
    )

    override val page2: List<Hero> = listOf(
        Hero(
            id = 4,
            name = "Spider-Man",
            image = "/images/spiderman.jpg",
            about = "親愛なる隣人",
            rating = 4.7,
            power = 85,
            month = "August",
            day = "10th",
            family = listOf(
                "May",
                "Ben"
            ),
            abilities = listOf(
                "ウェブシューター",
                "スパイダーセンス",
                "壁登り"
            ),
            natureTypes = emptyList(),
        ),
        Hero(
            id = 5,
            name = "Captain America",
            image = "/images/captainamerica.jpg",
            about = "自由の象徴",
            rating = 4.8,
            power = 88,
            month = "July",
            day = "4th",
            family = listOf(
                "Sarah",
                "Bucky"
            ),
            abilities = listOf(
                "ヴィブラニウムシールド",
                "超人兵士血清",
                "戦術指揮"
            ),
            natureTypes = emptyList(),
        ),
        Hero(
            id = 6,
            name = "Black Widow",
            image = "/images/blackwidow.jpg",
            about = "元KGBのスパイ",
            rating = 4.6,
            power = 82,
            month = "December",
            day = "3rd",
            family = listOf(
                "Yelena",
                "Alexei"
            ),
            abilities = listOf(
                "ウィドウズバイト",
                "格闘術",
                "スパイ技術"
            ),
            natureTypes = emptyList(),
        )
    )

    override val page3: List<Hero> = listOf(
        Hero(
            id = 7,
            name = "Doctor Strange",
            image = "/images/doctorstrange.jpg",
            about = "魔術の最高位マスター",
            rating = 4.7,
            power = 95,
            month = "November",
            day = "18th",
            family = listOf(
                "Donna",
                "Christine"
            ),
            abilities = listOf(
                "時の石",
                "ミラーディメンション",
                "アストラル投影"
            ),
            natureTypes = listOf("Magic"),
        ),
        Hero(
            id = 8,
            name = "Black Panther",
            image = "/images/blackpanther.jpg",
            about = "ワカンダの王",
            rating = 4.9,
            power = 90,
            month = "January",
            day = "26th",
            family = listOf(
                "T'Chaka",
                "Shuri"
            ),
            abilities = listOf(
                "ヴィブラニウムスーツ",
                "運動能力強化",
                "俊敏性"
            ),
            natureTypes = emptyList(),
        ),
        Hero(
            id = 9,
            name = "Scarlet Witch",
            image = "/images/scarletwitch.jpg",
            about = "現実改変能力を持つ魔女",
            rating = 4.8,
            power = 96,
            month = "February",
            day = "10th",
            family = listOf(
                "Pietro",
                "Vision"
            ),
            abilities = listOf(
                "カオスマジック",
                "念動力",
                "現実改変"
            ),
            natureTypes = listOf("Magic", "Psychic"),
        )
    )

    override val page4: List<Hero> = listOf(
        Hero(
            id = 10,
            name = "Vision",
            image = "/images/vision.jpg",
            about = "シンセゾイドのヒーロー",
            rating = 4.6,
            power = 93,
            month = "March",
            day = "15th",
            family = listOf(
                "Wanda",
                "Jarvis"
            ),
            abilities = listOf(
                "マインドストーン",
                "密度制御",
                "フライト"
            ),
            natureTypes = emptyList(),
        ),
        Hero(
            id = 11,
            name = "Hawkeye",
            image = "/images/hawkeye.jpg",
            about = "百発百中の弓使い",
            rating = 4.5,
            power = 80,
            month = "October",
            day = "1st",
            family = listOf(
                "Laura",
                "Kate"
            ),
            abilities = listOf(
                "精密射撃",
                "トリック矢",
                "戦術判断"
            ),
            natureTypes = emptyList(),
        ),
        Hero(
            id = 12,
            name = "Ant-Man",
            image = "/images/antman.jpg",
            about = "サイズを自在に変えるヒーロー",
            rating = 4.4,
            power = 78,
            month = "June",
            day = "20th",
            family = listOf(
                "Cassie",
                "Hope"
            ),
            abilities = listOf(
                "ピム粒子",
                "アリ操作",
                "サイズ変化"
            ),
            natureTypes = emptyList(),
        )
    )

    override val page5: List<Hero> = listOf(
        Hero(
            id = 13,
            name = "Star-Lord",
            image = "/images/starlord.jpg",
            about = "ガーディアンズ・オブ・ギャラクシーのリーダー",
            rating = 4.5,
            power = 79,
            month = "February",
            day = "14th",
            family = listOf(
                "Meredith",
                "Gamora"
            ),
            abilities = listOf(
                "エレメントガン",
                "ジェットブーツ",
                "指揮能力"
            ),
            natureTypes = emptyList(),
        ),
        Hero(
            id = 14,
            name = "Gamora",
            image = "/images/gamora.jpg",
            about = "銀河で最も危険な女性",
            rating = 4.6,
            power = 86,
            month = "April",
            day = "7th",
            family = listOf(
                "Thanos",
                "Nebula"
            ),
            abilities = listOf(
                "ゴッドスレイヤー",
                "暗殺術",
                "運動能力強化"
            ),
            natureTypes = emptyList(),
        ),
        Hero(
            id = 15,
            name = "Groot",
            image = "/images/groot.jpg",
            about = "樹木型の心優しい戦士",
            rating = 4.7,
            power = 84,
            month = "September",
            day = "5th",
            family = listOf(
                "Rocket"
            ),
            abilities = listOf(
                "枝の伸長",
                "再生能力",
                "I am Groot"
            ),
            natureTypes = listOf("Wood"),
        )
    )

    override suspend fun getAllHeroes(page: Int): ApiResponse {

        val nextPageNumber = if (page == 5) null else page + 1
        val prevPageNumber = if (page == 1) null else page - 1

        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = prevPageNumber,
            nextPage = nextPageNumber,
            heroes = heroes[page]!!
        )
    }

    override suspend fun searchHeroes(name: String): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = null,
            nextPage = null,
            heroes = findHeroesByName(name)
        )
    }

    private fun findHeroesByName(name: String): List<Hero> {
        val foundHeroes = mutableListOf<Hero>()

        return if (!name.isNullOrEmpty()) {
            heroes.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(name.lowercase())) {
                        foundHeroes.add(hero)
                    }
                }
            }
            foundHeroes
        } else {
            emptyList()
        }
    }
}
