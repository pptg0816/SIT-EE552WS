# Simple Spellchecker
This assignment relies on a very rudimentary form of spellchecking.  `words.txt` 
contains a list of the 5,000 most common English words according to https://www.wordfrequency.info.

All you are checking for is whether each word in the files your checking can be 
found in the words list.  Because of this, there will be several false-positives
for less common words (e.g. "conspicuous"  in the Peter Pan quote).  Lewis Carroll,
who wrote Alice in Wonderland, was also famous for inventing words so there should be 
many more words highlighted in that passage compared to Peter Pan.

The starter code already contains the method to spellcheck a single word since
it requires the use some Java features we haven't discussed yet.  Your job is to 
write the code to read the source files line-by-line, split each line into
individual words, and then use my function to check each word.