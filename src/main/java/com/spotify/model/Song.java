package com.spotify.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="song")
public class Song {
	@Id
	@Column(name="name")
	String name;
	@Column(name="artists")
	String artists;
	@Column(name="danceability")
	BigDecimal danceability;
	@Column(name="energy")
	BigDecimal energy;
	@Column(name="keynote")
	Integer keynote;
	@Column(name="loudness")
	BigDecimal loudness;
	@Column(name="mode")
	Integer mode;
	@Column(name="speechiness")
	BigDecimal speechiness;
	@Column(name="acousticness")
	BigDecimal acousticness;
	@Column(name="instrumentalness")
	BigDecimal instrumentalness;
	@Column(name="liveness")
	BigDecimal liveness;
	@Column(name="valence")
	BigDecimal valence;
	@Column(name="tempo")
	BigDecimal tempo;
	@Column(name="duration_ms")
	Integer duration_ms;
	@Column(name="time_signature")
	Integer time_signature;
	@Column(name="rank")
	Integer rank;
	
	public Song() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists = artists;
	}
	public BigDecimal getDanceability() {
		return danceability;
	}
	public void setDanceability(BigDecimal danceability) {
		this.danceability = danceability;
	}
	public BigDecimal getEnergy() {
		return energy;
	}
	public void setEnergy(BigDecimal energy) {
		this.energy = energy;
	}
	public Integer getKeynote() {
		return keynote;
	}
	public void setKeynote(Integer keynote) {
		this.keynote = keynote;
	}
	public BigDecimal getLoudness() {
		return loudness;
	}
	public void setLoudness(BigDecimal loudness) {
		this.loudness = loudness;
	}
	public Integer getMode() {
		return mode;
	}
	public void setMode(Integer mode) {
		this.mode = mode;
	}
	public BigDecimal getSpeechiness() {
		return speechiness;
	}
	public void setSpeechiness(BigDecimal speechiness) {
		this.speechiness = speechiness;
	}
	public BigDecimal getAcousticness() {
		return acousticness;
	}
	public void setAcousticness(BigDecimal acousticness) {
		this.acousticness = acousticness;
	}
	public BigDecimal getInstrumentalness() {
		return instrumentalness;
	}
	public void setInstrumentalness(BigDecimal instrumentalness) {
		this.instrumentalness = instrumentalness;
	}
	public BigDecimal getLiveness() {
		return liveness;
	}
	public void setLiveness(BigDecimal liveness) {
		this.liveness = liveness;
	}
	public BigDecimal getValence() {
		return valence;
	}
	public void setValence(BigDecimal valence) {
		this.valence = valence;
	}
	public BigDecimal getTempo() {
		return tempo;
	}
	public void setTempo(BigDecimal tempo) {
		this.tempo = tempo;
	}
	public Integer getDuration_ms() {
		return duration_ms;
	}
	public void setDuration_ms(Integer duration_ms) {
		this.duration_ms = duration_ms;
	}
	public Integer getTime_signature() {
		return time_signature;
	}
	public void setTime_signature(Integer time_signature) {
		this.time_signature = time_signature;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acousticness == null) ? 0 : acousticness.hashCode());
		result = prime * result + ((artists == null) ? 0 : artists.hashCode());
		result = prime * result + ((danceability == null) ? 0 : danceability.hashCode());
		result = prime * result + ((duration_ms == null) ? 0 : duration_ms.hashCode());
		result = prime * result + ((energy == null) ? 0 : energy.hashCode());
		result = prime * result + ((instrumentalness == null) ? 0 : instrumentalness.hashCode());
		result = prime * result + ((keynote == null) ? 0 : keynote.hashCode());
		result = prime * result + ((liveness == null) ? 0 : liveness.hashCode());
		result = prime * result + ((loudness == null) ? 0 : loudness.hashCode());
		result = prime * result + ((mode == null) ? 0 : mode.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((speechiness == null) ? 0 : speechiness.hashCode());
		result = prime * result + ((tempo == null) ? 0 : tempo.hashCode());
		result = prime * result + ((time_signature == null) ? 0 : time_signature.hashCode());
		result = prime * result + ((valence == null) ? 0 : valence.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (acousticness == null) {
			if (other.acousticness != null)
				return false;
		} else if (!acousticness.equals(other.acousticness))
			return false;
		if (artists == null) {
			if (other.artists != null)
				return false;
		} else if (!artists.equals(other.artists))
			return false;
		if (danceability == null) {
			if (other.danceability != null)
				return false;
		} else if (!danceability.equals(other.danceability))
			return false;
		if (duration_ms == null) {
			if (other.duration_ms != null)
				return false;
		} else if (!duration_ms.equals(other.duration_ms))
			return false;
		if (energy == null) {
			if (other.energy != null)
				return false;
		} else if (!energy.equals(other.energy))
			return false;
		if (instrumentalness == null) {
			if (other.instrumentalness != null)
				return false;
		} else if (!instrumentalness.equals(other.instrumentalness))
			return false;
		if (keynote == null) {
			if (other.keynote != null)
				return false;
		} else if (!keynote.equals(other.keynote))
			return false;
		if (liveness == null) {
			if (other.liveness != null)
				return false;
		} else if (!liveness.equals(other.liveness))
			return false;
		if (loudness == null) {
			if (other.loudness != null)
				return false;
		} else if (!loudness.equals(other.loudness))
			return false;
		if (mode == null) {
			if (other.mode != null)
				return false;
		} else if (!mode.equals(other.mode))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rank == null) {
			if (other.rank != null)
				return false;
		} else if (!rank.equals(other.rank))
			return false;
		if (speechiness == null) {
			if (other.speechiness != null)
				return false;
		} else if (!speechiness.equals(other.speechiness))
			return false;
		if (tempo == null) {
			if (other.tempo != null)
				return false;
		} else if (!tempo.equals(other.tempo))
			return false;
		if (time_signature == null) {
			if (other.time_signature != null)
				return false;
		} else if (!time_signature.equals(other.time_signature))
			return false;
		if (valence == null) {
			if (other.valence != null)
				return false;
		} else if (!valence.equals(other.valence))
			return false;
		return true;
	}
	
}
