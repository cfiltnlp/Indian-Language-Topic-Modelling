#!/bin/bash

NUMBERS="2 3 4 6 7 8 9 10"


for number in `echo $NUMBERS`
do
	TOPICNO=$number
	##Creating folders for Multiple Topics##
	
	echo "Creating folders for topic $TOPICNO"
	mkdir K$TOPICNO
	cd K$TOPICNO
	mkdir moses_health_topicModel_HE
	mkdir moses_tourism_topicModel_HE
	mkdir moses_tourism_topicModel_cartesian_HE
	mkdir moses_health_topicModel_cartesian_HE
	
	cd moses_health_topicModel_HE
	mkdir corpus
	cd ..
	##
	cd moses_tourism_topicModel_HE
	mkdir tourism_HE
	cd ..
	##
	cd moses_tourism_topicModel_cartesian_HE
	mkdir tourism_HE
	cd ..
	##
	cd moses_health_topicModel_cartesian_HE
	mkdir corpus
	cd ..
	##
	
	cd ..
done
echo
exit 0






