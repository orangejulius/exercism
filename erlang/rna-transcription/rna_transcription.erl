-module(rna_transcription).
-export([to_rna/1]).

convert_nucleotide(N) ->
	case N of
		$G -> $C;
		$C -> $G;
		$T -> $A;
		$A -> $U;
		true -> oops
	end.

to_rna(Nucleotides) ->
	[convert_nucleotide(Nucleotide) || Nucleotide <- Nucleotides].
