wm.types = {
	"types": {
		"boolean": {
			"primitiveType": "Boolean",
			"internal": true
		},
		"byte": {
			"primitiveType": "Number",
			"internal": true
		},
		"char": {
			"primitiveType": "String",
			"internal": true
		},
		"com.mcm2.tracking.BloodSlide": {
			"service": "tracking",
			"liveService": false,
			"internal": false,
			"fields": {
				"comments": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 32,
					"noChange": [],
					"include": []
				},
				"dateCollected": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": true,
					"fieldOrder": 8,
					"noChange": [],
					"include": []
				},
				"dateRead": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": true,
					"fieldOrder": 11,
					"noChange": [],
					"include": []
				},
				"firstName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"hamlet": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Hamlet",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"id": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"interviewerInitials": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 10,
					"noChange": [],
					"include": []
				},
				"knowHamlet": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 7,
					"noChange": [],
					"include": []
				},
				"labTechInitials": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 33,
					"noChange": [],
					"include": []
				},
				"middleName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 5,
					"noChange": [],
					"include": []
				},
				"numGametocytes": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 28,
					"noChange": [],
					"include": []
				},
				"numInfectedRbc": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 30,
					"noChange": [],
					"include": []
				},
				"numTrophozoites": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 26,
					"noChange": [],
					"include": []
				},
				"numWbcAsexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 27,
					"noChange": [],
					"include": []
				},
				"numWbcSexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 29,
					"noChange": [],
					"include": []
				},
				"parasiteSeen": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 25,
					"noChange": [],
					"include": []
				},
				"patientId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"pfAsexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 13,
					"noChange": [],
					"include": []
				},
				"pfGametocyte": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 14,
					"noChange": [],
					"include": []
				},
				"pfSexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 15,
					"noChange": [],
					"include": []
				},
				"pmAsexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 16,
					"noChange": [],
					"include": []
				},
				"pmGametocyte": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 17,
					"noChange": [],
					"include": []
				},
				"pmSexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 18,
					"noChange": [],
					"include": []
				},
				"poAsexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 19,
					"noChange": [],
					"include": []
				},
				"poGametocyte": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 20,
					"noChange": [],
					"include": []
				},
				"poSexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 21,
					"noChange": [],
					"include": []
				},
				"pvAsexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 22,
					"noChange": [],
					"include": []
				},
				"pvGametocyte": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 23,
					"noChange": [],
					"include": []
				},
				"pvSexual": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 24,
					"noChange": [],
					"include": []
				},
				"reader": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 12,
					"noChange": [],
					"include": []
				},
				"surname": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 6,
					"noChange": [],
					"include": []
				},
				"timeCollected": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": true,
					"fieldOrder": 9,
					"noChange": [],
					"include": []
				},
				"totalRbc": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 31,
					"noChange": [],
					"include": []
				},
				"village": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Village",
					"required": true,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.mcm2.tracking.District": {
			"service": "tracking",
			"liveService": false,
			"internal": false,
			"fields": {
				"district": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"id": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"wards": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Ward",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.mcm2.tracking.Hamlet": {
			"service": "tracking",
			"liveService": false,
			"internal": false,
			"fields": {
				"bloodSlides": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.BloodSlide",
					"required": false,
					"fieldOrder": 5,
					"noChange": [],
					"include": []
				},
				"hamletId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"hamletName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"healthFacilities": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.HealthFacility",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"patients": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Patient",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"village": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Village",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.mcm2.tracking.HealthFacility": {
			"service": "tracking",
			"liveService": false,
			"internal": false,
			"fields": {
				"facilityId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"facilityName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"facilityType": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"hamlet": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Hamlet",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"healthworkers": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Healthworker",
					"required": false,
					"fieldOrder": 5,
					"noChange": [],
					"include": []
				},
				"id": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.mcm2.tracking.Healthworker": {
			"service": "tracking",
			"liveService": false,
			"internal": false,
			"fields": {
				"firstName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"healthFacility": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.HealthFacility",
					"required": true,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"id": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"middleName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"surname": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.mcm2.tracking.Patient": {
			"service": "tracking",
			"liveService": false,
			"internal": false,
			"fields": {
				"dateOfBirth": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": false,
					"fieldOrder": 6,
					"noChange": [],
					"include": []
				},
				"firstName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"hamlet": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Hamlet",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"identifier": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"lastName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 5,
					"noChange": [],
					"include": []
				},
				"middleName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"patientId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"patientResultses": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.PatientResults",
					"required": false,
					"fieldOrder": 9,
					"noChange": [],
					"include": []
				},
				"sex": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 7,
					"noChange": [],
					"include": []
				},
				"street": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 8,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.mcm2.tracking.PatientResults": {
			"service": "tracking",
			"liveService": false,
			"internal": false,
			"fields": {
				"bsOtherTests": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 8,
					"noChange": [],
					"include": []
				},
				"bsResult": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 7,
					"noChange": [],
					"include": []
				},
				"mrdtControl": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"mrdtIntepretation": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 6,
					"noChange": [],
					"include": []
				},
				"mrdtPalcifarum": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"mrdtPan": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 5,
					"noChange": [],
					"include": []
				},
				"patient": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Patient",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"resultsId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"testDate": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.mcm2.tracking.Village": {
			"service": "tracking",
			"liveService": false,
			"internal": false,
			"fields": {
				"bloodSlides": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.BloodSlide",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"hamlets": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Hamlet",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"villageId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Integer",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"villageName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"ward": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Ward",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.mcm2.tracking.Ward": {
			"service": "tracking",
			"liveService": false,
			"internal": false,
			"fields": {
				"district": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.District",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"villages": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.mcm2.tracking.Village",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"wardId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Short",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"wardName": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				}
			}
		},
		"double": {
			"primitiveType": "Number",
			"internal": true
		},
		"float": {
			"primitiveType": "Number",
			"internal": true
		},
		"int": {
			"primitiveType": "Number",
			"internal": true
		},
		"java.lang.Boolean": {
			"primitiveType": "Boolean",
			"internal": false
		},
		"java.lang.Byte": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Character": {
			"primitiveType": "String",
			"internal": false
		},
		"java.lang.Double": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Float": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Integer": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Long": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Short": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.String": {
			"primitiveType": "String",
			"internal": false
		},
		"java.lang.StringBuffer": {
			"primitiveType": "String",
			"internal": false
		},
		"java.math.BigDecimal": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.math.BigInteger": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.sql.Date": {
			"primitiveType": "Date",
			"internal": false
		},
		"java.sql.Time": {
			"primitiveType": "Date",
			"internal": false
		},
		"java.sql.Timestamp": {
			"primitiveType": "Date",
			"internal": false
		},
		"java.util.Date": {
			"primitiveType": "Date",
			"internal": false
		},
		"long": {
			"primitiveType": "Number",
			"internal": true
		},
		"org.joda.time.LocalDateTime": {
			"primitiveType": "DateTime",
			"internal": true
		},
		"short": {
			"primitiveType": "Number",
			"internal": true
		}
	}
};