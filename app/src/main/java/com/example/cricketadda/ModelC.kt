package com.example.cricketadda

import java.io.Serializable

data class ModelC(var titleImage:Int=0,
                  var Name:String?=null,
                  var Born:String?=null,
                  var Age:String?=null,
                  var Teams:String?=null,
                  var Nickname:String?=null,
                  var BatStyle:String?=null,
                  var BowlStyle:String?=null): Serializable
