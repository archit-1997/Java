.DEFAULT_GOAL := fmt

.PHONY: fmt
fmt:
	prettier --write "**/*.java"

