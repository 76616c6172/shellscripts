#!/bin/bash
# Usage: f <partial or complete filename>
# Searches current directory recursively for the first argument provided
# Does NOT go down hidden filepaths on purpose (use . instead of glob expansion ** to traverse hidden)

find ** -name "*$1*"
