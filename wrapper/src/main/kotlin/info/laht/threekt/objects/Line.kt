@file:JsQualifier("THREE")

package info.laht.threekt.objects

import info.laht.threekt.core.*
import info.laht.threekt.materials.Material

open external class Line : Object3D {

    constructor(geometry: BufferGeometry, material: Material)

    var geometry: BufferGeometry
    var material: Material

    fun raycast(raycaster: Raycaster, intercects: List<Intersect>)

    fun clone() : Line

}
