-module(bob).
-export([response_for/1]).

response_for(Message) ->
	IsShout = is_shout(Message),
	IsQuestion = is_question(Message),
	IsSilence = is_silence(Message),
	if
		IsShout -> "Whoa, chill out!";
		IsQuestion -> "Sure.";
		IsSilence -> "Fine. Be that way!";
		true -> "Whatever."
	end.

is_shout(Message) ->
	(string:to_upper(Message) == Message) and (string:to_lower(Message) =/= Message).

is_question(Message) ->
	string:right(Message, 1) == "?".

is_silence(Message) ->
	string:strip(Message) == "".
