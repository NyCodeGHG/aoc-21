package com.github.warriorzz.aoc

import java.io.File
import kotlin.math.abs

private fun main() {
    println("Day 02:")

    var depth = 0
    var horizontal = 0
    File("./input/day-02.txt").readLines().forEach {
        it.split(" ").apply {
            when (this.first()) {
                "forward" -> horizontal += this[1].toInt()
                "up" -> depth += this[1].toInt()
                "down" -> depth -= this[1].toInt()
            }
        }
    }
    println("Solution part 1: ${abs(horizontal) * abs(depth)}")

    depth = 0
    horizontal = 0
    var aim = 0
    File("./input/day-02.txt").readLines().forEach {
        it.split(" ").apply {
            when (this.first()) {
                "forward" -> {
                    horizontal += this[1].toInt(); depth += aim * this[1].toInt()
                }
                "up" -> aim += this[1].toInt()
                "down" -> aim -= this[1].toInt()
            }
        }
    }
    println("Solution part 2: ${abs(horizontal) * abs(depth)}")
}

fun day02() = main()
