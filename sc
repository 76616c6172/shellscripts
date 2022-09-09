#!/bin/bash
# search code
# Helper script to quickly locate a repo inside my own codebase and open it in vscode
# Searches hardcoded directory the arguments provided
#
# Usage: sc <partial or complete repo name>
# Select repo through entering number

FOLDER="/home/valar/projects/github/"
declare -a dirs=()

find "$FOLDER" -name "*$@*" | ( while read file ; do
  dirs+=( "$file" );
  done

  # Display the directories that where found
  num=0
  for i in "${dirs[@]}" ; do
    echo $num "$i"
    num=$(($num+1))
  done

  # Exit subshell if no match found
  if [ $num -eq 0 ] ; then
    echo "No repo found"
    exit 1
  fi
)

# Exit for real if no match found in subshell
if [ $? == 1 ] ; then
  exit 1
fi
  
# Ask the user to pick the repo by number
read input

# Repeat the search and open the repo the user selected
# There is probably a nicer way to do this without searching twice -
# - but hey, since we're only searching dirs non recursively it's probably okay.
num=0
find "$FOLDER" -name "*$@*" | ( while read file ; do
  dirs+=( "$file" );
    if [ $num -eq $input ] ; then
      code "$file"
      break
    fi
      num=$(($num+1))
  done
)

exit 0;
