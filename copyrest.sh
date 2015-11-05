#!/bin/bash

NUMBERS="2 3 4 6 7 8 9 10"


for number in `echo $NUMBERS`
do
	TOPICNO=$number
	##Copying tuning and testing files for Multiple Topics##
	
	echo "Copying tuning and testing files for topic $TOPICNO"
	cd K$TOPICNO
	cd moses_health_topicModel_HE
	cd corpus
	cp ../../../health/tun.* .
	cp ../../../health/test.* .
	cd ..
	rm sample_moses_params.conf
	touch sample_moses_params.conf
	echo "
# All paths must be absolute paths 

# workspace directory where the intermediate and output files will be created 
# required
WORKSPACE_DIR=\"$PWD/workspace\"

# parallel corpus directory path : must be absolute path
# required 
parallel_corpus=\"$PWD/corpus\"

# parallel corpus description 
# optional 
parallel_corpus_desc=\"English - Hindi\"

# target language corpus
# optional: BUT required if language model has not already been created 
monolingual_corpus=\"/home/development/diptesh/IndianTopicMT/hindimonolingual.tokenized.withILCIhealth\"

# target language corpus description 
# optional 
monolingual_corpus_desc=\"Hindi Monolingual Cleaned Corpus\" 

# target language - language model 
# required
target_lm=\"/home/development/diptesh/IndianTopicMT/hindi_monolingual.lm\"

# source language 
# required 
SRC_LANG=\"en\"

# target language 
# required 
TGT_LANG=\"hi\"

# SRILM options 
SRILM_OPTS=\"-tolower -order 5 -interpolate -kndiscount -text $monolingual_corpus -lm $target_lm\"
            
# Moses training script option ( train-model.perl )            
TRAIN_MODEL_OPTS=\"-alignment grow-diag-final-and -reordering msd-bidirectional-fe -lm 0:5:$target_lm:0 -mgiza  -mgiza-cpus 12\"

# Moses decoder options 
MOSES_DECODER_OPTS=\"-threads 8\"

# MERT training options 
MERT_OPTS=\"--decoder-flags='-threads 8'\"
" >> sample_moses_params.conf
	cd ../../
	cd K$TOPICNO
	cd moses_health_topicModel_cartesian_HE
	cd corpus
	cp ../../../health/tun.* .
	cp ../../../health/test.* .
	cd ..
	rm sample_moses_params.conf
	touch sample_moses_params.conf
	echo "
# All paths must be absolute paths 

# workspace directory where the intermediate and output files will be created 
# required
WORKSPACE_DIR=\"$PWD/workspace\"

# parallel corpus directory path : must be absolute path
# required 
parallel_corpus=\"$PWD/corpus\"

# parallel corpus description 
# optional 
parallel_corpus_desc=\"English - Hindi\"

# target language corpus
# optional: BUT required if language model has not already been created 
monolingual_corpus=\"/home/development/diptesh/IndianTopicMT/hindimonolingual.tokenized.withILCIhealth\"

# target language corpus description 
# optional 
monolingual_corpus_desc=\"Hindi Monolingual Cleaned Corpus\" 

# target language - language model 
# required
target_lm=\"/home/development/diptesh/IndianTopicMT/hindi_monolingual.lm\"

# source language 
# required 
SRC_LANG=\"en\"

# target language 
# required 
TGT_LANG=\"hi\"

# SRILM options 
SRILM_OPTS=\"-tolower -order 5 -interpolate -kndiscount -text $monolingual_corpus -lm $target_lm\"
            
# Moses training script option ( train-model.perl )            
TRAIN_MODEL_OPTS=\"-alignment grow-diag-final-and -reordering msd-bidirectional-fe -lm 0:5:$target_lm:0 -mgiza  -mgiza-cpus 12\"

# Moses decoder options 
MOSES_DECODER_OPTS=\"-threads 8\"

# MERT training options 
MERT_OPTS=\"--decoder-flags='-threads 8'\"
" >> sample_moses_params.conf
	cd ../../
	cd K$TOPICNO
	cd moses_tourism_topicModel_HE
	cd tourism_HE
	cp ../../../tourism/tun.* .
	cp ../../../tourism/test.* .
	cd ..
	rm sample_moses_params.conf
	touch sample_moses_params.conf
	echo "
# All paths must be absolute paths 

# workspace directory where the intermediate and output files will be created 
# required
WORKSPACE_DIR=\"$PWD/workspace\"

# parallel corpus directory path : must be absolute path
# required 
parallel_corpus=\"$PWD/corpus\"

# parallel corpus description 
# optional 
parallel_corpus_desc=\"English - Hindi\"

# target language corpus
# optional: BUT required if language model has not already been created 
monolingual_corpus=\"/home/development/diptesh/IndianTopicMT/hindimonolingual.tokenized.withILCIhealth\"

# target language corpus description 
# optional 
monolingual_corpus_desc=\"Hindi Monolingual Cleaned Corpus\" 

# target language - language model 
# required
target_lm=\"/home/development/diptesh/IndianTopicMT/hindi_monolingual.lm\"

# source language 
# required 
SRC_LANG=\"en\"

# target language 
# required 
TGT_LANG=\"hi\"

# SRILM options 
SRILM_OPTS=\"-tolower -order 5 -interpolate -kndiscount -text $monolingual_corpus -lm $target_lm\"
            
# Moses training script option ( train-model.perl )            
TRAIN_MODEL_OPTS=\"-alignment grow-diag-final-and -reordering msd-bidirectional-fe -lm 0:5:$target_lm:0 -mgiza  -mgiza-cpus 12\"

# Moses decoder options 
MOSES_DECODER_OPTS=\"-threads 8\"

# MERT training options 
MERT_OPTS=\"--decoder-flags='-threads 8'\"
" >> sample_moses_params.conf
	cd ../../
	cd K$TOPICNO
	cd moses_tourism_topicModel_cartesian_HE
	cd tourism_HE
	cp ../../../tourism/tun.* .
	cp ../../../tourism/test.* .
	cd ..
	rm sample_moses_params.conf
	touch sample_moses_params.conf
	echo "
# All paths must be absolute paths 

# workspace directory where the intermediate and output files will be created 
# required
WORKSPACE_DIR=\"$PWD/workspace\"

# parallel corpus directory path : must be absolute path
# required 
parallel_corpus=\"$PWD/corpus\"

# parallel corpus description 
# optional 
parallel_corpus_desc=\"English - Hindi\"

# target language corpus
# optional: BUT required if language model has not already been created 
monolingual_corpus=\"/home/development/diptesh/IndianTopicMT/hindimonolingual.tokenized.withILCIhealth\"

# target language corpus description 
# optional 
monolingual_corpus_desc=\"Hindi Monolingual Cleaned Corpus\" 

# target language - language model 
# required
target_lm=\"/home/development/diptesh/IndianTopicMT/hindi_monolingual.lm\"

# source language 
# required 
SRC_LANG=\"en\"

# target language 
# required 
TGT_LANG=\"hi\"

# SRILM options 
SRILM_OPTS=\"-tolower -order 5 -interpolate -kndiscount -text $monolingual_corpus -lm $target_lm\"
            
# Moses training script option ( train-model.perl )            
TRAIN_MODEL_OPTS=\"-alignment grow-diag-final-and -reordering msd-bidirectional-fe -lm 0:5:$target_lm:0 -mgiza  -mgiza-cpus 12\"

# Moses decoder options 
MOSES_DECODER_OPTS=\"-threads 8\"

# MERT training options 
MERT_OPTS=\"--decoder-flags='-threads 8'\"
" >> sample_moses_params.conf
	cd ../../
done
echo
exit 0
